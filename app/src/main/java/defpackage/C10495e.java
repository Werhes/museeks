package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.PublicKey;

/* renamed from: eَۙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10495e implements PublicKey {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f20711e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16527e f20712e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5547e f20713e;

    public C10495e(C0524e c0524e) {
        C5547e c5547e = c0524e.f2670e.Signature()[0];
        C16527e c16527e = c0524e.f2669e;
        byte[] license = AbstractC12442e.license(c0524e.f2668e);
        this.f20713e = c5547e;
        this.f20712e = c16527e;
        this.f20711e = AbstractC12442e.license(license);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "ExternalKey";
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [extends, catch, eًٌَ] */
    /* JADX WARN: Type inference failed for: r5v2, types: [default, catch, eًٌَ] */
    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            C16527e c16527e = new C16527e(InterfaceC18291e.f35769e);
            C5547e c5547e = this.f20713e;
            C16527e c16527e2 = this.f20712e;
            byte[] bArr = this.f20711e;
            C9120e c9120e = new C9120e(c5547e);
            byte[] license = AbstractC12442e.license(bArr);
            crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
            crashlyticsVar.appmetrica(c9120e);
            crashlyticsVar.appmetrica(c16527e2);
            crashlyticsVar.appmetrica(new Cprotected(license));
            ?? ccatch = new Ccatch(crashlyticsVar);
            ccatch.f20096e = -1;
            isPro ispro = new isPro(0, ccatch.smaato());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ?? ccatch2 = new Ccatch(c16527e, ispro);
            ccatch2.f20096e = -1;
            ccatch2.subscription(byteArrayOutputStream, "DER");
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(AbstractC8703e.admob(e, new StringBuilder("unable to encode composite key: ")));
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }
}
