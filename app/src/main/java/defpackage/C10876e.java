package defpackage;

import java.util.ArrayList;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10876e extends AbstractC7654e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C5507e f21531e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C10876e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f21532e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final boolean f21533e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final boolean f21534e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final EnumC11700e f21535e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final boolean f21536e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final boolean f21537e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final boolean f21538e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final boolean f21539e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final boolean f21540e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f21541e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final EnumC4169e f21542e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final boolean f21543e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f21544e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final EnumC5778e f21545e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f21546e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f21547e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final boolean f21548e;

    public C10876e(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, EnumC5778e enumC5778e, EnumC11700e enumC11700e, EnumC4169e enumC4169e, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C0193e c0193e) {
        super(f21531e, c0193e);
        this.f21544e = z;
        this.f21532e = z2;
        this.f21547e = z3;
        this.f21546e = z4;
        this.f21541e = z5;
        this.f21545e = enumC5778e;
        this.f21535e = enumC11700e;
        this.f21542e = enumC4169e;
        this.f21534e = z6;
        this.f21533e = z7;
        this.f21536e = z8;
        this.f21539e = z9;
        this.f21540e = z10;
        this.f21538e = z11;
        this.f21537e = z12;
        this.f21543e = z13;
        this.f21548e = z14;
    }

    public static C10876e vip(C10876e c10876e, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, EnumC5778e enumC5778e, EnumC11700e enumC11700e, EnumC4169e enumC4169e, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i) {
        boolean z14 = (i & 1) != 0 ? c10876e.f21544e : z;
        boolean z15 = (i & 2) != 0 ? c10876e.f21532e : z2;
        boolean z16 = (i & 4) != 0 ? c10876e.f21547e : z3;
        boolean z17 = (i & 8) != 0 ? c10876e.f21546e : z4;
        boolean z18 = (i & 16) != 0 ? c10876e.f21541e : z5;
        EnumC5778e enumC5778e2 = (i & 32) != 0 ? c10876e.f21545e : enumC5778e;
        EnumC11700e enumC11700e2 = (i & 64) != 0 ? c10876e.f21535e : enumC11700e;
        EnumC4169e enumC4169e2 = (i & 128) != 0 ? c10876e.f21542e : enumC4169e;
        boolean z19 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c10876e.f21534e : z6;
        boolean z20 = (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c10876e.f21533e : z7;
        boolean z21 = (i & 1024) != 0 ? c10876e.f21536e : z8;
        boolean z22 = (i & 2048) != 0 ? c10876e.f21539e : z9;
        boolean z23 = (i & 4096) != 0 ? c10876e.f21540e : z10;
        boolean z24 = (i & 8192) != 0 ? c10876e.f21538e : z11;
        boolean z25 = c10876e.f21537e;
        boolean z26 = (32768 & i) != 0 ? c10876e.f21543e : z12;
        boolean z27 = (i & 65536) != 0 ? c10876e.f21548e : z13;
        C0193e ad = c10876e.ad();
        c10876e.getClass();
        return new C10876e(z14, z15, z16, z17, z18, enumC5778e2, enumC11700e2, enumC4169e2, z19, z20, z21, z22, z23, z24, z25, z26, z27, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10876e)) {
            return false;
        }
        C10876e c10876e = (C10876e) obj;
        return AbstractC7890e.billing(ad(), c10876e.ad()) && this.f21544e == c10876e.f21544e && this.f21532e == c10876e.f21532e && this.f21547e == c10876e.f21547e && this.f21546e == c10876e.f21546e && this.f21541e == c10876e.f21541e && this.f21545e == c10876e.f21545e && this.f21535e == c10876e.f21535e && this.f21542e == c10876e.f21542e && this.f21534e == c10876e.f21534e && this.f21533e == c10876e.f21533e && this.f21536e == c10876e.f21536e && this.f21539e == c10876e.f21539e && this.f21540e == c10876e.f21540e && this.f21538e == c10876e.f21538e && this.f21537e == c10876e.f21537e && this.f21543e == c10876e.f21543e && this.f21548e == c10876e.f21548e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((((((((((((this.f21542e.hashCode() + ((this.f21535e.hashCode() + ((this.f21545e.hashCode() + (((((((((((ad().hashCode() * 37) + (this.f21544e ? 1231 : 1237)) * 37) + (this.f21532e ? 1231 : 1237)) * 37) + (this.f21547e ? 1231 : 1237)) * 37) + (this.f21546e ? 1231 : 1237)) * 37) + (this.f21541e ? 1231 : 1237)) * 37)) * 37)) * 37)) * 37) + (this.f21534e ? 1231 : 1237)) * 37) + (this.f21533e ? 1231 : 1237)) * 37) + (this.f21536e ? 1231 : 1237)) * 37) + (this.f21539e ? 1231 : 1237)) * 37) + (this.f21540e ? 1231 : 1237)) * 37) + (this.f21538e ? 1231 : 1237)) * 37) + (this.f21537e ? 1231 : 1237)) * 37) + (this.f21543e ? 1231 : 1237)) * 37) + (this.f21548e ? 1231 : 1237);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringBuilder premium = AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(new StringBuilder("enable_fullscreen_artwork="), this.f21544e, arrayList, "enable_artwork_swiping="), this.f21532e, arrayList, "enable_color_tining="), this.f21547e, arrayList, "enable_mini_player_swiping="), this.f21546e, arrayList, "enable_global_hearts="), this.f21541e, arrayList, "background_type=");
        premium.append(this.f21545e);
        arrayList.add(premium.toString());
        arrayList.add("background_blur_material_theme=" + this.f21535e);
        arrayList.add("background_blur_material_thickness=" + this.f21542e);
        AbstractC8647e.m2460this(AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(AbstractC8647e.premium(new StringBuilder("enable_artwork_rounding="), this.f21534e, arrayList, "enable_system_bars_hiding="), this.f21533e, arrayList, "enable_keep_screen_on="), this.f21536e, arrayList, "enable_hide_dislikes="), this.f21539e, arrayList, "disable_vibration_effects="), this.f21540e, arrayList, "enable_volume_bar_in_np="), this.f21538e, arrayList, "hide_sharing_button="), this.f21537e, arrayList, "hide_controls_in_lyrics="), this.f21543e, arrayList, "hide_artwork_border="), this.f21548e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "VkxNowPlayingPreferences{", "}", null, 56);
    }
}
