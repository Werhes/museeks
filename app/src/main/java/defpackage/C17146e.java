package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17146e extends AbstractC13922e {
    public final String ad;
    public final C16899e vip;

    public C17146e(String str, C16899e c16899e) {
        this.ad = str;
        this.vip = c16899e;
    }

    @Override // defpackage.AbstractC13922e
    public final void purchase(int i) {
        C16899e c16899e;
        String str = this.ad;
        if (str == null || (c16899e = this.vip) == null) {
            return;
        }
        c16899e.admob(i, str);
    }

    @Override // defpackage.AbstractC13922e
    public final void startapp(int i) {
        C16899e c16899e;
        String str = this.ad;
        if (str == null || (c16899e = this.vip) == null) {
            return;
        }
        c16899e.subscription(i, str);
    }
}
