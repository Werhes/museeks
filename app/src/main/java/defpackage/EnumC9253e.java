package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9253e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC9253e f18465e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC9253e f18466e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9253e[] f18467e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC9253e f18468e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٍؖ۠] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٍؖ۠] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٍؖ۠] */
    static {
        ?? r0 = new Enum("ContinueTraversal", 0);
        f18468e = r0;
        ?? r1 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        f18466e = r1;
        ?? r3 = new Enum("CancelTraversal", 2);
        f18465e = r3;
        f18467e = new EnumC9253e[]{r0, r1, r3};
    }

    public static EnumC9253e valueOf(String str) {
        return (EnumC9253e) Enum.valueOf(EnumC9253e.class, str);
    }

    public static EnumC9253e[] values() {
        return (EnumC9253e[]) f18467e.clone();
    }
}
