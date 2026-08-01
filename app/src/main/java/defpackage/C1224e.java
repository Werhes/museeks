package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* renamed from: eؒٞۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1224e implements InterfaceC6610e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C4865e f3861e;

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public final C17424e mo3419appmetrica() {
        C4865e c4865e = this.f3861e;
        C3297e c3297e = c4865e.f10340e;
        SecureRandom secureRandom = (SecureRandom) c4865e.f26878e;
        BigInteger bigInteger = c3297e.f7457e;
        BigInteger bigInteger2 = c3297e.f7458e;
        BigInteger bigInteger3 = c3297e.f7456e;
        while (true) {
            BigInteger metrica = AbstractC5907e.metrica(PSKKeyManager.MAX_KEY_LENGTH_BYTES, secureRandom);
            if (metrica.signum() >= 1 && metrica.compareTo(bigInteger) < 0 && AbstractC0903e.appmetrica(metrica) >= 64) {
                return new C17424e(new C17901e(bigInteger3.modPow(metrica, bigInteger2), c3297e), new C13537e(metrica, c3297e), false, 5);
            }
        }
    }

    @Override // defpackage.InterfaceC6610e
    public final void loadAd(C13572e c13572e) {
        C4865e c4865e = (C4865e) c13572e;
        this.f3861e = c4865e;
        AbstractC0259e.vip(c4865e.f10340e.f7458e);
        C3297e c3297e = this.f3861e.f10340e;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }
}
