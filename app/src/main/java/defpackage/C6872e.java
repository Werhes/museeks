package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6872e extends AbstractC3004e {
    public final C11127e ad;
    public final Integer metrica;
    public final C15768e vip;

    public C6872e(C11127e c11127e, C15768e c15768e, Integer num) {
        this.ad = c11127e;
        this.vip = c15768e;
        this.metrica = num;
    }

    public static C6872e smaato(C11127e c11127e, Integer num) {
        C15768e ad;
        C2443e c2443e = c11127e.vip;
        if (c2443e == C2443e.f6249e) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            ad = C15768e.ad(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (c2443e != C2443e.f6250e) {
                throw new GeneralSecurityException("Unknown Variant: " + c2443e);
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            ad = C15768e.ad(new byte[0]);
        }
        return new C6872e(c11127e, ad, num);
    }

    @Override // defpackage.AbstractC3004e
    public final C15768e advert() {
        return this.vip;
    }

    @Override // defpackage.AbstractC14783e
    public final AbstractC12699e metrica() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14783e
    public final Integer vip() {
        return this.metrica;
    }
}
