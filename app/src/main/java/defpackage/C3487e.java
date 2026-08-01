package defpackage;

import java.util.ArrayList;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٛٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3487e extends AbstractC7654e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C12832e f7751e = new C12832e(AbstractC3820e.ad.vip(C3487e.class));

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f7752e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final boolean f7753e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final boolean f7754e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final boolean f7755e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final int f7756e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final boolean f7757e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final Map f7758e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f7759e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final boolean f7760e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f7761e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f7762e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f7763e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f7764e;

    public C3487e(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, Map map, int i7, boolean z5, C0193e c0193e) {
        super(f7751e, c0193e);
        this.f7761e = i;
        this.f7752e = i2;
        this.f7764e = i3;
        this.f7763e = i4;
        this.f7759e = i5;
        this.f7762e = i6;
        this.f7755e = z;
        this.f7760e = z2;
        this.f7754e = z3;
        this.f7753e = z4;
        this.f7756e = i7;
        this.f7757e = z5;
        this.f7758e = AbstractC4224e.yandex("overrides", map);
    }

    public static C3487e vip(C3487e c3487e, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, Map map, int i7, boolean z5, int i8) {
        int i9 = (i8 & 1) != 0 ? c3487e.f7761e : i;
        int i10 = (i8 & 2) != 0 ? c3487e.f7752e : i2;
        int i11 = (i8 & 4) != 0 ? c3487e.f7764e : i3;
        int i12 = (i8 & 8) != 0 ? c3487e.f7763e : i4;
        int i13 = (i8 & 16) != 0 ? c3487e.f7759e : i5;
        int i14 = (i8 & 32) != 0 ? c3487e.f7762e : i6;
        boolean z6 = (i8 & 64) != 0 ? c3487e.f7755e : z;
        boolean z7 = (i8 & 128) != 0 ? c3487e.f7760e : z2;
        boolean z8 = (i8 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c3487e.f7754e : z3;
        boolean z9 = (i8 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c3487e.f7753e : z4;
        Map map2 = (i8 & 1024) != 0 ? c3487e.f7758e : map;
        int i15 = (i8 & 2048) != 0 ? c3487e.f7756e : i7;
        boolean z10 = (i8 & 4096) != 0 ? c3487e.f7757e : z5;
        C0193e ad = c3487e.ad();
        c3487e.getClass();
        return new C3487e(i9, i10, i11, i12, i13, i14, z6, z7, z8, z9, map2, i15, z10, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3487e)) {
            return false;
        }
        C3487e c3487e = (C3487e) obj;
        return AbstractC7890e.billing(ad(), c3487e.ad()) && this.f7761e == c3487e.f7761e && this.f7752e == c3487e.f7752e && this.f7764e == c3487e.f7764e && this.f7763e == c3487e.f7763e && this.f7759e == c3487e.f7759e && this.f7762e == c3487e.f7762e && this.f7755e == c3487e.f7755e && this.f7760e == c3487e.f7760e && this.f7754e == c3487e.f7754e && this.f7753e == c3487e.f7753e && AbstractC7890e.billing(this.f7758e, c3487e.f7758e) && this.f7756e == c3487e.f7756e && this.f7757e == c3487e.f7757e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((this.f7758e.hashCode() + (((((((((((((((((((((ad().hashCode() * 37) + this.f7761e) * 37) + this.f7752e) * 37) + this.f7764e) * 37) + this.f7763e) * 37) + this.f7759e) * 37) + this.f7762e) * 37) + (this.f7755e ? 1231 : 1237)) * 37) + (this.f7760e ? 1231 : 1237)) * 37) + (this.f7754e ? 1231 : 1237)) * 37) + (this.f7753e ? 1231 : 1237)) * 37)) * 37) + this.f7756e) * 37) + (this.f7757e ? 1231 : 1237);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("current_theme_id=" + this.f7761e);
        arrayList.add("current_accent_id=" + this.f7752e);
        arrayList.add("last_light_theme_id=" + this.f7764e);
        arrayList.add("last_light_accent_id=" + this.f7763e);
        arrayList.add("last_dark_theme_id=" + this.f7759e);
        arrayList.add("last_dark_accent_id=" + this.f7762e);
        AbstractC8647e.m2460this(AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(new StringBuilder("system_theme_switching="), this.f7755e, arrayList, "system_monet_theme="), this.f7760e, arrayList, "system_monet_accent="), this.f7754e, arrayList, "use_overrides="), this.f7753e, arrayList);
        Map map = this.f7758e;
        if (!map.isEmpty()) {
            arrayList.add("overrides=" + map);
        }
        arrayList.add("override_dpi=" + this.f7756e);
        AbstractC8647e.m2460this(new StringBuilder("override_dpi_enabled="), this.f7757e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "VkxThemingPreferences{", "}", null, 56);
    }
}
