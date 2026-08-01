package defpackage;

/* loaded from: classes3.dex */
public interface mopub {
    void ad(int i, int i2, byte[] bArr);

    int doFinal(byte[] bArr, int i);

    String getAlgorithmName();

    int getOutputSize(int i);

    int getUpdateOutputSize(int i);

    void init(boolean z, InterfaceC3894e interfaceC3894e);

    int processByte(byte b, byte[] bArr, int i);

    int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    byte[] vip();
}
