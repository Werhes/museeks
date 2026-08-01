package defpackage;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.adcel;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.utils.purchase;
import androidx.car.app.vip;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٔٔ */
/* loaded from: classes.dex */
public abstract class AbstractC1815e {
    public static final int AUDIO_CONTENT_BUFFER_SIZE = 512;
    public static final String AUDIO_CONTENT_MIME = "audio/l16";
    public static final int AUDIO_CONTENT_SAMPLING_RATE = 16000;
    private static final int RECORDSTATE_RECORDING = 1;
    private static final int RECORDSTATE_REMOTE_CLOSED = 2;
    private static final int RECORDSTATE_STOPPED = 0;
    private final adcel mCarContext;
    private OpenMicrophoneResponse mOpenMicrophoneResponse;
    private int mRecordingState = 0;
    private final Object mRecordingStateLock = new Object();

    public AbstractC1815e(adcel adcelVar) {
        this.mCarContext = adcelVar;
    }

    public static /* synthetic */ void ad(AbstractC1815e abstractC1815e) {
        synchronized (abstractC1815e.mRecordingStateLock) {
            abstractC1815e.mRecordingState = 2;
        }
    }

    public static AbstractC1815e create(adcel adcelVar) {
        Objects.requireNonNull(adcelVar);
        try {
            return (AbstractC1815e) Class.forName(adcelVar.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "androidx.car.app.media.AutomotiveCarAudioRecord" : "androidx.car.app.media.ProjectedCarAudioRecord").getConstructor(adcel.class).newInstance(adcelVar);
        } catch (ReflectiveOperationException unused) {
            throw new IllegalStateException("CarAudioRecord not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        synchronized (this.mRecordingStateLock) {
            int i3 = this.mRecordingState;
            if (i3 == 0) {
                throw new IllegalStateException("Called read before calling startRecording or after calling stopRecording");
            }
            if (i3 != 2) {
                return readInternal(bArr, i, i2);
            }
            return -1;
        }
    }

    public abstract int readInternal(byte[] bArr, int i, int i2);

    public void startRecording() {
        OpenMicrophoneResponse openMicrophoneResponse;
        synchronized (this.mRecordingStateLock) {
            try {
                if (this.mRecordingState != 0) {
                    throw new IllegalStateException("Cannot start recording if it has started and not been stopped");
                }
                vip vipVar = (vip) this.mCarContext.vip(vip.class);
                OpenMicrophoneRequest openMicrophoneRequest = new OpenMicrophoneRequest(new C8338e(new C0211e(9, this)));
                vipVar.getClass();
                try {
                    openMicrophoneResponse = (OpenMicrophoneResponse) purchase.appmetrica("openMicrophone", new C12879e(vipVar.metrica, "app", "openMicrophone", new C0211e(2, openMicrophoneRequest)));
                } catch (RemoteException e) {
                    Log.e("CarApp", "Error getting microphone bytes from host", e);
                    openMicrophoneResponse = null;
                }
                this.mOpenMicrophoneResponse = openMicrophoneResponse;
                if (openMicrophoneResponse == null) {
                    Log.e("CarApp", "Did not get microphone input from host");
                    this.mOpenMicrophoneResponse = new OpenMicrophoneResponse(new C1967e(new C8391e(4)));
                }
                startRecordingInternal(this.mOpenMicrophoneResponse);
                this.mRecordingState = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse);

    public void stopRecording() {
        synchronized (this.mRecordingStateLock) {
            try {
                OpenMicrophoneResponse openMicrophoneResponse = this.mOpenMicrophoneResponse;
                if (openMicrophoneResponse != null) {
                    if (this.mRecordingState != 2) {
                        openMicrophoneResponse.getCarAudioCallback().onStopRecording();
                    }
                    this.mOpenMicrophoneResponse = null;
                }
                stopRecordingInternal();
                this.mRecordingState = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void stopRecordingInternal();
}
