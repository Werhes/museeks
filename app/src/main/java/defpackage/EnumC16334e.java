package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٛۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC16334e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final HashMap f32095e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC16334e f32096e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC16334e f32097e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC16334e f32098e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC16334e f32099e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC16334e[] f32100e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC16334e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Enum, eٖٛۗ] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Enum, eٖٛۗ] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Enum, eٖٛۗ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, eٖٛۗ] */
    static {
        Enum r0 = new Enum("svg", 0);
        Enum r1 = new Enum("a", 1);
        Enum r3 = new Enum("circle", 2);
        Enum r5 = new Enum("clipPath", 3);
        Enum r7 = new Enum("defs", 4);
        ?? r9 = new Enum("desc", 5);
        f32099e = r9;
        Enum r11 = new Enum("ellipse", 6);
        Enum r13 = new Enum("g", 7);
        Enum r15 = new Enum("image", 8);
        Enum r2 = new Enum("line", 9);
        Enum r4 = new Enum("linearGradient", 10);
        Enum r6 = new Enum("marker", 11);
        Enum r8 = new Enum("mask", 12);
        Enum r10 = new Enum("path", 13);
        Enum r12 = new Enum("pattern", 14);
        Enum r14 = new Enum("polygon", 15);
        Enum r02 = new Enum("polyline", 16);
        Enum r16 = new Enum("radialGradient", 17);
        Enum r22 = new Enum("rect", 18);
        Enum r03 = new Enum("solidColor", 19);
        Enum r17 = new Enum("stop", 20);
        Enum r23 = new Enum("style", 21);
        ?? r04 = new Enum("SWITCH", 22);
        f32097e = r04;
        Enum r18 = new Enum("symbol", 23);
        Enum r05 = new Enum("text", 24);
        Enum r19 = new Enum("textPath", 25);
        ?? r06 = new Enum("title", 26);
        f32096e = r06;
        Enum r110 = new Enum("tref", 27);
        Enum r07 = new Enum("tspan", 28);
        Enum r111 = new Enum("use", 29);
        Enum r08 = new Enum("view", 30);
        ?? r112 = new Enum("UNSUPPORTED", 31);
        f32098e = r112;
        f32100e = new EnumC16334e[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2, r4, r6, r8, r10, r12, r14, r02, r16, r22, r03, r17, r23, r04, r18, r05, r19, r06, r110, r07, r111, r08, r112};
        f32095e = new HashMap();
        for (EnumC16334e enumC16334e : values()) {
            if (enumC16334e == f32097e) {
                f32095e.put("switch", enumC16334e);
            } else if (enumC16334e != f32098e) {
                f32095e.put(enumC16334e.name(), enumC16334e);
            }
        }
    }

    public static EnumC16334e valueOf(String str) {
        return (EnumC16334e) Enum.valueOf(EnumC16334e.class, str);
    }

    public static EnumC16334e[] values() {
        return (EnumC16334e[]) f32100e.clone();
    }
}
