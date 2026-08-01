package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17593e extends AbstractC3362e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3362e f34455e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient int f34456e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient int f34457e;

    public C17593e(AbstractC3362e abstractC3362e, int i, int i2) {
        this.f34455e = abstractC3362e;
        this.f34456e = i;
        this.f34457e = i2;
    }

    @Override // defpackage.AbstractC14292e
    public final Object[] adcel() {
        return this.f34455e.adcel();
    }

    @Override // defpackage.AbstractC3362e, java.util.List
    /* renamed from: advert, reason: merged with bridge method [inline-methods] */
    public final AbstractC3362e subList(int i, int i2) {
        AbstractC11866e.amazon(i, i2, this.f34457e);
        int i3 = this.f34456e;
        return this.f34455e.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.AbstractC14292e
    public final int billing() {
        return this.f34455e.yandex() + this.f34456e + this.f34457e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC11866e.smaato(i, this.f34457e);
        return this.f34455e.get(i + this.f34456e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34457e;
    }

    @Override // defpackage.AbstractC14292e
    public final boolean startapp() {
        return true;
    }

    @Override // defpackage.AbstractC14292e
    public final int yandex() {
        return this.f34455e.yandex() + this.f34456e;
    }
}
