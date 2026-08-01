package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14804e extends AbstractC6080e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6080e f29333e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient int f29334e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient int f29335e;

    public C14804e(AbstractC6080e abstractC6080e, int i, int i2) {
        this.f29333e = abstractC6080e;
        this.f29334e = i;
        this.f29335e = i2;
    }

    @Override // defpackage.AbstractC6080e, java.util.List
    /* renamed from: adcel, reason: merged with bridge method [inline-methods] */
    public final AbstractC6080e subList(int i, int i2) {
        AbstractC7023e.amazon(i, i2, this.f29335e);
        int i3 = this.f29334e;
        return this.f29333e.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.AbstractC10967e
    public final int billing() {
        return this.f29333e.yandex() + this.f29334e + this.f29335e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC7023e.smaato(i, this.f29335e);
        return this.f29333e.get(i + this.f29334e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29335e;
    }

    @Override // defpackage.AbstractC10967e
    public final Object[] startapp() {
        return this.f29333e.startapp();
    }

    @Override // defpackage.AbstractC10967e
    public final int yandex() {
        return this.f29333e.yandex() + this.f29334e;
    }
}
