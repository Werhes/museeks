package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eٍَۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9666e implements InterfaceC6610e, InterfaceC4563e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public SecureRandom f19160e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16833e f19161e;

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public C17424e mo3419appmetrica() {
        BigInteger bigInteger = this.f19161e.f32974e;
        int bitLength = bigInteger.bitLength();
        int i = bitLength >>> 2;
        while (true) {
            BigInteger metrica = AbstractC5907e.metrica(bitLength, this.f19160e);
            if (metrica.compareTo(InterfaceC4563e.Signature) >= 0 && metrica.compareTo(bigInteger) < 0 && AbstractC0903e.appmetrica(metrica) >= i) {
                return new C17424e(new C2964e(new C4630e(0).license(this.f19161e.f32972e, metrica), this.f19161e), new C6988e(metrica, this.f19161e), false, 5);
            }
        }
    }

    @Override // defpackage.InterfaceC6610e
    public final void loadAd(C13572e c13572e) {
        C15063e c15063e = (C15063e) c13572e;
        this.f19160e = (SecureRandom) c15063e.f26878e;
        C16833e c16833e = c15063e.f29827e;
        this.f19161e = c16833e;
        AbstractC0259e.ad(c16833e.f32975e);
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }
}
