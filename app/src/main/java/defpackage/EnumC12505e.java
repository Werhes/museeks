package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC12505e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC12505e[] f25045e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC12505e f25046e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f25047e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f25048e;

    static {
        EnumC12505e enumC12505e = new EnumC12505e("SavedPlaybackQueue", false, 0);
        f25046e = enumC12505e;
        EnumC12505e[] enumC12505eArr = {enumC12505e, new EnumC12505e("MyLibrary", true, 1), new EnumC12505e("VkMix", false, 2), new EnumC12505e("CachedLibrary", true, 3)};
        f25045e = enumC12505eArr;
        f25047e = new C15937e(enumC12505eArr);
    }

    public EnumC12505e(String str, boolean z, int i) {
        this.f25048e = z;
    }

    public static EnumC12505e valueOf(String str) {
        return (EnumC12505e) Enum.valueOf(EnumC12505e.class, str);
    }

    public static EnumC12505e[] values() {
        return (EnumC12505e[]) f25045e.clone();
    }
}
