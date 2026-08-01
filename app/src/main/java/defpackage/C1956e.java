package defpackage;

import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* renamed from: eٜؓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1956e extends C13038e {
    public final /* synthetic */ int metrica;

    @Override // defpackage.C13038e
    public byte[] ad() {
        switch (this.metrica) {
            case 0:
                byte[] bArr = new byte[8];
                do {
                    this.ad.nextBytes(bArr);
                    AbstractC7822e.metrica(bArr);
                } while (AbstractC7822e.vip(0, bArr));
                return bArr;
            default:
                byte[] ad = super.ad();
                if (ad.length != 32) {
                    throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
                }
                ad[3] = (byte) (ad[3] & 15);
                ad[7] = (byte) (ad[7] & 15);
                ad[11] = (byte) (ad[11] & 15);
                ad[15] = (byte) (ad[15] & 15);
                ad[4] = (byte) (ad[4] & (-4));
                ad[8] = (byte) (ad[8] & (-4));
                ad[12] = (byte) (ad[12] & (-4));
                return ad;
        }
    }

    @Override // defpackage.C13038e
    public void vip(C13572e c13572e) {
        switch (this.metrica) {
            case 0:
                super.vip(c13572e);
                int i = this.vip;
                if (i == 0 || i == 7) {
                    this.vip = 8;
                } else if (i != 8) {
                    throw new IllegalArgumentException("DES key must be 64 bits long.");
                }
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                return;
            default:
                super.vip(new C13572e(PSKKeyManager.MAX_KEY_LENGTH_BYTES, (SecureRandom) c13572e.f26878e));
                return;
        }
    }
}
