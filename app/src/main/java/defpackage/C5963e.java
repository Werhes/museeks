package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5963e extends AbstractC17230e {
    public final C17681e ad;
    public final int appmetrica;
    public final C14171e license;
    public final Integer metrica;
    public final String vip;

    public C5963e(C17681e c17681e, int i, C14171e c14171e, int i2) {
        int i3;
        String str = c17681e.vip;
        Integer num = (i2 & 16) != 0 ? null : 0;
        c14171e = (i2 & 32) != 0 ? null : c14171e;
        this.ad = c17681e;
        this.vip = str;
        this.metrica = num;
        this.license = c14171e;
        if (i < 10) {
            i3 = 1;
        } else if (i < 100) {
            i3 = 2;
        } else {
            if (i >= 1000) {
                throw new IllegalArgumentException(AbstractC1634e.smaato("Max value ", i, " is too large"));
            }
            i3 = 3;
        }
        this.appmetrica = i3;
    }

    @Override // defpackage.AbstractC17230e
    public final C17681e ad() {
        return this.ad;
    }

    @Override // defpackage.AbstractC17230e
    public final C14171e license() {
        return this.license;
    }

    @Override // defpackage.AbstractC17230e
    public final String metrica() {
        return this.vip;
    }

    @Override // defpackage.AbstractC17230e
    public final Object vip() {
        return this.metrica;
    }
}
