package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6693e extends AbstractC4517e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float f13805e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final float f13806e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final float f13807e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f13808e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int f13809e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final float f13810e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final List f13811e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final float f13812e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final float f13813e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC4457e f13814e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f13815e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f13816e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final float f13817e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AbstractC4457e f13818e;

    public C6693e(String str, List list, int i, AbstractC4457e abstractC4457e, float f, AbstractC4457e abstractC4457e2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.f13816e = str;
        this.f13811e = list;
        this.f13808e = i;
        this.f13814e = abstractC4457e;
        this.f13805e = f;
        this.f13818e = abstractC4457e2;
        this.f13817e = f2;
        this.f13812e = f3;
        this.f13815e = i2;
        this.f13809e = i3;
        this.f13813e = f4;
        this.f13807e = f5;
        this.f13806e = f6;
        this.f13810e = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6693e.class == obj.getClass()) {
            C6693e c6693e = (C6693e) obj;
            return AbstractC7890e.billing(this.f13816e, c6693e.f13816e) && AbstractC7890e.billing(this.f13814e, c6693e.f13814e) && this.f13805e == c6693e.f13805e && AbstractC7890e.billing(this.f13818e, c6693e.f13818e) && this.f13817e == c6693e.f13817e && this.f13812e == c6693e.f13812e && this.f13815e == c6693e.f13815e && this.f13809e == c6693e.f13809e && this.f13813e == c6693e.f13813e && this.f13807e == c6693e.f13807e && this.f13806e == c6693e.f13806e && this.f13810e == c6693e.f13810e && this.f13808e == c6693e.f13808e && AbstractC7890e.billing(this.f13811e, c6693e.f13811e);
        }
        return false;
    }

    public final int hashCode() {
        int billing = AbstractC17861e.billing(this.f13816e.hashCode() * 31, 31, this.f13811e);
        AbstractC4457e abstractC4457e = this.f13814e;
        int license = AbstractC1414e.license((billing + (abstractC4457e != null ? abstractC4457e.hashCode() : 0)) * 31, this.f13805e, 31);
        AbstractC4457e abstractC4457e2 = this.f13818e;
        return AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license((((AbstractC1414e.license(AbstractC1414e.license((license + (abstractC4457e2 != null ? abstractC4457e2.hashCode() : 0)) * 31, this.f13817e, 31), this.f13812e, 31) + this.f13815e) * 31) + this.f13809e) * 31, this.f13813e, 31), this.f13807e, 31), this.f13806e, 31), this.f13810e, 31) + this.f13808e;
    }
}
