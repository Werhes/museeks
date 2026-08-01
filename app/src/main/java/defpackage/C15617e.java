package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٝۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15617e extends AbstractC14783e {
    public final C2544e ad;
    public final C17974e vip;

    public C15617e(C2544e c2544e, C17974e c17974e) {
        this.ad = c2544e;
        this.vip = c17974e;
    }

    public static C15617e advert(C2544e c2544e, C17974e c17974e) {
        if (c2544e.ad == ((C15768e) c17974e.f35233e).ad.length) {
            return new C15617e(c2544e, c17974e);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // defpackage.AbstractC14783e
    public final AbstractC12699e metrica() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14783e
    public final Integer vip() {
        return null;
    }
}
