package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1280e extends AbstractC7391e implements Comparable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f3989e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f3990e;

    public C1280e(int i, C16437e c16437e, int i2, C16672e c16672e, int i3) {
        super(i, c16437e, i2);
        int i4;
        this.f3989e = AbstractC0054e.inmobi(i3, c16672e.f32713e) ? 1 : 0;
        C16975e c16975e = this.f15149e;
        int i5 = c16975e.tapsense;
        int i6 = -1;
        if (i5 != -1 && (i4 = c16975e.isVip) != -1) {
            i6 = i5 * i4;
        }
        this.f3990e = i6;
    }

    @Override // defpackage.AbstractC7391e
    public final int ad() {
        return this.f3989e;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f3990e, ((C1280e) obj).f3990e);
    }

    @Override // defpackage.AbstractC7391e
    public final /* bridge */ /* synthetic */ boolean vip(AbstractC7391e abstractC7391e) {
        return false;
    }
}
