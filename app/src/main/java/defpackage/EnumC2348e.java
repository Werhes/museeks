package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2348e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2348e[] f5884e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC2348e f5885e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2348e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eؔؔٔ] */
    static {
        Enum r0 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("ANDROID_FIREBASE", 1);
        f5885e = r1;
        f5884e = new EnumC2348e[]{r0, r1};
    }

    public static EnumC2348e valueOf(String str) {
        return (EnumC2348e) Enum.valueOf(EnumC2348e.class, str);
    }

    public static EnumC2348e[] values() {
        return (EnumC2348e[]) f5884e.clone();
    }
}
