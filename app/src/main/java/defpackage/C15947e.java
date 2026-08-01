package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15947e extends AbstractC7654e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C12771e f31404e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C15947e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f31405e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f31406e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f31407e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final boolean f31408e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f31409e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f31410e;

    public /* synthetic */ C15947e(String str, String str2, int i, String str3, boolean z, boolean z2, int i2) {
        this(str, (i2 & 2) != 0 ? BuildConfig.FLAVOR : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? BuildConfig.FLAVOR : str3, z, (i2 & 32) != 0 ? false : z2, C0193e.f1409e);
    }

    public C15947e(String str, String str2, int i, String str3, boolean z, boolean z2, C0193e c0193e) {
        super(f31404e, c0193e);
        this.f31407e = str;
        this.f31405e = str2;
        this.f31410e = i;
        this.f31409e = str3;
        this.f31406e = z;
        this.f31408e = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15947e)) {
            return false;
        }
        C15947e c15947e = (C15947e) obj;
        return AbstractC7890e.billing(ad(), c15947e.ad()) && AbstractC7890e.billing(this.f31407e, c15947e.f31407e) && AbstractC7890e.billing(this.f31405e, c15947e.f31405e) && this.f31410e == c15947e.f31410e && AbstractC7890e.billing(this.f31409e, c15947e.f31409e) && this.f31406e == c15947e.f31406e && this.f31408e == c15947e.f31408e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int advert = ((AbstractC1786e.advert((AbstractC1786e.advert(AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f31407e), 37, this.f31405e) + this.f31410e) * 37, 37, this.f31409e) + (this.f31406e ? 1231 : 1237)) * 37) + (this.f31408e ? 1231 : 1237);
        this.f15551e = advert;
        return advert;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC8647e.m2457goto(this.f31407e, "class_name=", arrayList);
        arrayList.add("file_name=".concat(AbstractC4224e.advert(this.f31405e)));
        arrayList.add("line_number=" + this.f31410e);
        arrayList.add("method_name=".concat(AbstractC4224e.advert(this.f31409e)));
        AbstractC8647e.m2460this(AbstractC8647e.premium(new StringBuilder("is_native_method="), this.f31406e, arrayList, "is_sourcefile_cleared="), this.f31408e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "StackTraceElement{", "}", null, 56);
    }
}
