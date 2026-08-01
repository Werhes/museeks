package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0769e extends AbstractC3160e implements InterfaceC8614e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f3123e;

    public AbstractC0769e(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f3123e = (i & 2) == 2;
    }

    @Override // defpackage.AbstractC3160e
    public final InterfaceC15954e adcel() {
        return this.f3123e ? this : super.adcel();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0769e) {
            AbstractC0769e abstractC0769e = (AbstractC0769e) obj;
            return amazon().equals(abstractC0769e.amazon()) && this.f7267e.equals(abstractC0769e.f7267e) && this.f7264e.equals(abstractC0769e.f7264e) && AbstractC7890e.billing(this.f7266e, abstractC0769e.f7266e);
        }
        if (obj instanceof InterfaceC8614e) {
            return obj.equals(adcel());
        }
        return false;
    }

    public final int hashCode() {
        return this.f7264e.hashCode() + AbstractC1786e.advert(amazon().hashCode() * 31, 31, this.f7267e);
    }

    @Override // defpackage.AbstractC3160e
    /* renamed from: isPro, reason: merged with bridge method [inline-methods] */
    public final InterfaceC8614e admob() {
        if (this.f3123e) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (InterfaceC8614e) super.admob();
    }

    public final String toString() {
        InterfaceC15954e adcel = adcel();
        return adcel != this ? adcel.toString() : AbstractC1786e.signatures(new StringBuilder("property "), this.f7267e, " (Kotlin reflection is not available)");
    }
}
