package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۧۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC18164e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f35586e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC18164e[] f35587e;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC18164e[] enumC18164eArr = {new Enum("MONDAY", 0), new Enum("TUESDAY", 1), new Enum("WEDNESDAY", 2), new Enum("THURSDAY", 3), new Enum("FRIDAY", 4), new Enum("SATURDAY", 5), new Enum("SUNDAY", 6)};
        f35587e = enumC18164eArr;
        f35586e = new C15937e(enumC18164eArr);
    }

    public static EnumC18164e valueOf(String str) {
        return (EnumC18164e) Enum.valueOf(EnumC18164e.class, str);
    }

    public static EnumC18164e[] values() {
        return (EnumC18164e[]) f35587e.clone();
    }
}
