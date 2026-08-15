import SwiftUI
import UIKit
import AVFoundation

/// Экран сканирования QR-кода VK для входа.
/// Показывает камеру с рамкой-видоискателем, кнопку закрытия
/// (чёрная круглая на белом фоне) и подсказку
/// «Where to find the code?», открывающую справку.
struct VKQRLoginView: View {
    @Environment(\.dismiss) private var dismiss
    @State private var cameraAuthorized = false
    @State private var isCameraDenied = false
    @State private var showsHelp = false
    @State private var scannedText: String?
    @State private var didScan = false

    /// Вызывается, когда QR-код распознан. В реальном сценарии сюда
    /// передаётся содержимое QR-кода VK (обычно ссылка на вход).
    var onScanned: (String) -> Void

    var body: some View {
        ZStack {
            Color.black.ignoresSafeArea()

            if isCameraDenied {
                deniedState
            } else {
                cameraLayer
            }
        }
        .overlay(alignment: .top) {
            closeButton
        }
        .onAppear {
            requestCameraAccess()
        }
        .onChange(of: scannedText) { value in
            guard let value, !value.isEmpty, !didScan else { return }
            didScan = true
            onScanned(value)
        }
        .sheet(isPresented: $showsHelp) {
            QRHelpSheet {
                showsHelp = false
            }
        }
    }

    // MARK: - Камера

    @ViewBuilder
    private var cameraLayer: some View {
        if cameraAuthorized {
            ZStack {
                QRScannerPreview { value in
                    scannedText = value
                }
                .ignoresSafeArea()

                // Лёгкое затемнение вокруг рамки видоискателя.
                scanDimOverlay

                // Белая рамка, в которую нужно поместить QR-код.
                scanFrame

                VStack {
                    Spacer()
                    VStack(spacing: 12) {
                        Image(systemName: "qrcode.viewfinder")
                            .font(.system(size: 40))
                            .foregroundStyle(.white)
                        Text(L10n.text("Наведите камеру на QR-код"))
                            .font(.subheadline.weight(.semibold))
                            .foregroundStyle(.white)
                    }
                    .padding(22)
                    Spacer()
                    helpButton
                        .padding(.bottom, 32)
                }
            }
        } else {
            // Камера ещё не разрешена / инициализируется.
            Color.black
                .overlay {
                    ProgressView()
                        .tint(.white)
                }
        }
    }

    /// Затемнение фона вокруг рамки видоискателя.
    private var scanDimOverlay: some View {
        Color.black.opacity(0.45)
            .mask {
                // Всё затемняем, кроме области внутри рамки.
                ZStack {
                    Color.black
                    RoundedRectangle(cornerRadius: 28, style: .continuous)
                        .frame(width: 252, height: 252)
                        .blendMode(.destinationOut)
                }
                .compositingGroup()
            }
            .allowsHitTesting(false)
    }

    /// Рамка-видоискатель, в которую нужно поместить QR-код.
    private var scanFrame: some View {
        RoundedRectangle(cornerRadius: 28, style: .continuous)
            .stroke(.white, lineWidth: 3)
            .frame(width: 252, height: 252)
            .shadow(color: .white.opacity(0.35), radius: 10)
    }

    // MARK: - Кнопки

    /// Чёрная круглая кнопка-крестик на белом фоне.
    private var closeButton: some View {
        Button {
            dismiss()
        } label: {
            Image(systemName: "xmark")
                .font(.system(size: 18, weight: .semibold))
                .foregroundStyle(.black)
                .frame(width: 44, height: 44)
                .background(Color.white, in: Circle())
                .shadow(color: .black.opacity(0.3), radius: 8, y: 3)
        }
        .padding(.top, 16)
        .accessibilityLabel("Закрыть")
    }

    /// Овальная кнопка с чёрным текстом на белом фоне (не liquid glass).
    private var helpButton: some View {
        Button {
            showsHelp = true
        } label: {
            Text(L10n.text("Where to find the code?"))
                .font(.headline)
                .foregroundStyle(.black)
                .padding(.horizontal, 24)
                .padding(.vertical, 14)
                .background(
                    Color.white,
                    in: Capsule()
                )
                .shadow(color: .black.opacity(0.25), radius: 10, y: 4)
        }
        .accessibilityLabel(L10n.text("Where to find the code?"))
    }

    // MARK: - Запрет доступа к камере

    private var deniedState: some View {
        VStack(spacing: 16) {
            Image(systemName: "camera")
                .font(.system(size: 44))
                .foregroundStyle(.white)
            Text(L10n.text("Нет доступа к камере"))
                .font(.title3.bold())
                .foregroundStyle(.white)
            Text(
                L10n.text(
                    "Разрешите доступ к камере в настройках, "
                        + "чтобы сканировать QR-код."
                )
            )
            .font(.subheadline)
            .foregroundStyle(.white.opacity(0.75))
            .multilineTextAlignment(.center)
            Button(L10n.text("Открыть настройки")) {
                guard let url = URL(
                    string: UIApplication.openSettingsURLString
                ) else { return }
                UIApplication.shared.open(url)
            }
            .buttonStyle(.borderedProminent)
        }
        .padding(24)
    }

    // MARK: - Разрешение на камеру

    private func requestCameraAccess() {
        switch AVCaptureDevice.authorizationStatus(for: .video) {
        case .authorized:
            cameraAuthorized = true
        case .notDetermined:
            AVCaptureDevice.requestAccess(for: .video) { granted in
                DispatchQueue.main.async {
                    if granted {
                        cameraAuthorized = true
                    } else {
                        isCameraDenied = true
                    }
                }
            }
        default:
            isCameraDenied = true
        }
    }
}

/// Справка «Where to find the code?».
/// Содержит заголовок и пошаговую инструкцию.
struct QRHelpSheet: View {
    var onDone: () -> Void

    var body: some View {
        VStack(alignment: .leading, spacing: 0) {
            // Заголовок окна белым текстом на тёмном фоне.
            Text(L10n.text("Where to find the code?"))
                .font(.headline)
                .foregroundStyle(.white)
                .frame(maxWidth: .infinity, alignment: .leading)
                .padding(20)
                .background(Color.black)

            VStack(alignment: .leading, spacing: 18) {
                step(
                    number: "1",
                    title: L10n.text("Open VK in the browser")
                )
                step(
                    number: "2",
                    title: L10n.text(
                        "Find your avatar on upper right corner"
                    )
                )
                step(
                    number: "3",
                    title: L10n.text(
                        "Click on it and select “Sign in with QR-Code”"
                    )
                )

                Spacer(minLength: 8)

                Button {
                    onDone()
                } label: {
                    Text(L10n.text("Got it!"))
                        .font(.headline)
                        .frame(maxWidth: .infinity)
                }
                .buttonStyle(.borderedProminent)
                .tint(.blue)
            }
            .padding(20)
        }
        .presentationDetents([.medium, .large])
    }

    private func step(number: String, title: String) -> some View {
        HStack(alignment: .top, spacing: 14) {
            Text(number)
                .font(.headline)
                .foregroundStyle(.white)
                .frame(width: 30, height: 30)
                .background(
                    Color.black,
                    in: Circle()
                )
            Text(title)
                .font(.subheadline)
                .foregroundStyle(.primary)
                .padding(.top, 5)
        }
    }
}

/// Обёртка над AVCaptureSession, предоставляющая превью камеры
/// и распознавание QR-кодов через AVCaptureMetadataOutput.
struct QRScannerPreview: UIViewRepresentable {
    let onDetect: (String) -> Void

    func makeUIView(context: Context) -> QRScannerView {
        let scanner = QRScannerView()
        scanner.onDetect = onDetect
        return scanner
    }

    func updateUIView(_ uiView: QRScannerView, context: Context) {}
}

final class QRScannerView: UIView {
    var onDetect: ((String) -> Void)?

    private let session = AVCaptureSession()
    private let sessionQueue = DispatchQueue(label: "qr.scanner.session")
    private let metadataQueue = DispatchQueue(label: "qr.scanner.metadata")
    private var previewLayer: AVCaptureVideoPreviewLayer?
    private var didDetect = false

    override init(frame: CGRect) {
        super.init(frame: frame)
        configureSession()
    }

    required init?(coder: NSCoder) {
        super.init(coder: coder)
        configureSession()
    }

    override func layoutSubviews() {
        super.layoutSubviews()
        previewLayer?.frame = bounds
    }

    private func configureSession() {
        sessionQueue.async { [weak self] in
            guard let self else { return }
            self.session.beginConfiguration()
            self.session.sessionPreset = .high

            guard let device = AVCaptureDevice.default(
                for: .video
            ),
            let input = try? AVCaptureDeviceInput(device: device),
            self.session.canAddInput(input) else {
                self.session.commitConfiguration()
                return
            }
            self.session.addInput(input)

            let output = AVCaptureMetadataOutput()
            guard self.session.canAddOutput(output) else {
                self.session.commitConfiguration()
                return
            }
            self.session.addOutput(output)
            output.setMetadataObjectsDelegate(
                self,
                queue: self.metadataQueue
            )
            output.metadataObjectTypes = [.qr]

            self.session.commitConfiguration()

            let layer = AVCaptureVideoPreviewLayer(session: self.session)
            layer.videoGravity = .resizeAspectFill
            DispatchQueue.main.async {
                layer.frame = self.bounds
                self.layer.addSublayer(layer)
                self.previewLayer = layer
            }

            self.session.startRunning()
        }
    }

    func stopScanning() {
        sessionQueue.async { [weak self] in
            guard let self, self.session.isRunning else { return }
            self.session.stopRunning()
        }
    }

    deinit {
        if session.isRunning {
            session.stopRunning()
        }
    }
}

extension QRScannerView: AVCaptureMetadataOutputObjectsDelegate {
    func metadataOutput(
        _ output: AVCaptureMetadataOutput,
        didOutput metadataObjects: [AVMetadataObject],
        from connection: AVCaptureConnection
    ) {
        guard !didDetect,
              let object = metadataObjects.first as? AVMetadataMachineReadableCodeObject,
              object.type == .qr,
              let value = object.stringValue,
              !value.isEmpty else { return }
        didDetect = true
        stopScanning()
        DispatchQueue.main.async { [weak self] in
            self?.onDetect?(value)
        }
    }
}