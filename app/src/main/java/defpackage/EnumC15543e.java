package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC15543e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC15543e[] f30690e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC15543e f30691e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, java.lang.Object, eٕٙؔ] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        f30691e = r0;
        Enum r1 = new Enum("UNMETERED_ONLY", 1);
        Enum r3 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r5 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r7 = new Enum("NEVER", 4);
        Enum r9 = new Enum("UNRECOGNIZED", 5);
        f30690e = new EnumC15543e[]{r0, r1, r3, r5, r7, r9};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r0);
        sparseArray.put(1, r1);
        sparseArray.put(2, r3);
        sparseArray.put(3, r5);
        sparseArray.put(4, r7);
        sparseArray.put(-1, r9);
    }

    public static EnumC15543e valueOf(String str) {
        return (EnumC15543e) Enum.valueOf(EnumC15543e.class, str);
    }

    public static EnumC15543e[] values() {
        return (EnumC15543e[]) f30690e.clone();
    }
}
