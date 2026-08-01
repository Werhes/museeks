package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8304e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8304e[] f16984e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC8304e f16985e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC8304e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eًٍۣ, java.lang.Object] */
    static {
        Enum r0 = new Enum("NOT_SET", 0);
        ?? r1 = new Enum("EVENT_OVERRIDE", 1);
        f16985e = r1;
        f16984e = new EnumC8304e[]{r0, r1};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r0);
        sparseArray.put(5, r1);
    }

    public static EnumC8304e valueOf(String str) {
        return (EnumC8304e) Enum.valueOf(EnumC8304e.class, str);
    }

    public static EnumC8304e[] values() {
        return (EnumC8304e[]) f16984e.clone();
    }
}
