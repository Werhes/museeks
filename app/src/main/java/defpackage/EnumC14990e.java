package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۜۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC14990e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final HashMap f29713e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC14990e f29714e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC14990e f29715e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC14990e f29716e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC14990e f29717e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14990e[] f29718e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC14990e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Enum, eٔۜۧ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٔۜۧ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, eٔۜۧ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, eٔۜۧ] */
    static {
        Enum r0 = new Enum("target", 0);
        Enum r1 = new Enum("root", 1);
        ?? r3 = new Enum("nth_child", 2);
        f29717e = r3;
        Enum r5 = new Enum("nth_last_child", 3);
        ?? r7 = new Enum("nth_of_type", 4);
        f29715e = r7;
        ?? r9 = new Enum("nth_last_of_type", 5);
        f29714e = r9;
        Enum r11 = new Enum("first_child", 6);
        Enum r13 = new Enum("last_child", 7);
        Enum r15 = new Enum("first_of_type", 8);
        Enum r2 = new Enum("last_of_type", 9);
        Enum r4 = new Enum("only_child", 10);
        Enum r6 = new Enum("only_of_type", 11);
        Enum r8 = new Enum("empty", 12);
        Enum r10 = new Enum("not", 13);
        Enum r12 = new Enum("lang", 14);
        Enum r14 = new Enum("link", 15);
        Enum r02 = new Enum("visited", 16);
        Enum r16 = new Enum("hover", 17);
        Enum r22 = new Enum("active", 18);
        Enum r03 = new Enum("focus", 19);
        Enum r17 = new Enum("enabled", 20);
        Enum r23 = new Enum("disabled", 21);
        Enum r04 = new Enum("checked", 22);
        Enum r18 = new Enum("indeterminate", 23);
        ?? r05 = new Enum("UNSUPPORTED", 24);
        f29716e = r05;
        f29718e = new EnumC14990e[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2, r4, r6, r8, r10, r12, r14, r02, r16, r22, r03, r17, r23, r04, r18, r05};
        f29713e = new HashMap();
        for (EnumC14990e enumC14990e : values()) {
            if (enumC14990e != f29716e) {
                f29713e.put(enumC14990e.name().replace('_', '-'), enumC14990e);
            }
        }
    }

    public static EnumC14990e valueOf(String str) {
        return (EnumC14990e) Enum.valueOf(EnumC14990e.class, str);
    }

    public static EnumC14990e[] values() {
        return (EnumC14990e[]) f29718e.clone();
    }
}
