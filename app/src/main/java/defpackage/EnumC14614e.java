package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC14614e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14614e[] f28834e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final HashMap f28835e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC14614e f28836e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC14614e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, eًٍٔ] */
    static {
        Enum r0 = new Enum("X86_32", 0);
        Enum r1 = new Enum("X86_64", 1);
        Enum r3 = new Enum("ARM_UNKNOWN", 2);
        Enum r5 = new Enum("PPC", 3);
        Enum r7 = new Enum("PPC64", 4);
        Enum r9 = new Enum("ARMV6", 5);
        Enum r11 = new Enum("ARMV7", 6);
        ?? r13 = new Enum("UNKNOWN", 7);
        f28836e = r13;
        Enum r15 = new Enum("ARMV7S", 8);
        Enum r2 = new Enum("ARM64", 9);
        f28834e = new EnumC14614e[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2};
        HashMap hashMap = new HashMap(4);
        f28835e = hashMap;
        hashMap.put("armeabi-v7a", r11);
        hashMap.put("armeabi", r9);
        hashMap.put("arm64-v8a", r2);
        hashMap.put("x86", r0);
    }

    public static EnumC14614e valueOf(String str) {
        return (EnumC14614e) Enum.valueOf(EnumC14614e.class, str);
    }

    public static EnumC14614e[] values() {
        return (EnumC14614e[]) f28834e.clone();
    }
}
