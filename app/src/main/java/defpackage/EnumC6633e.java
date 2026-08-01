package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6633e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6633e[] f13696e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final SparseArray f13697e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6633e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Enum r0 = new Enum("UNKNOWN_MOBILE_SUBTYPE", 0);
        Enum r1 = new Enum("GPRS", 1);
        Enum r3 = new Enum("EDGE", 2);
        Enum r5 = new Enum("UMTS", 3);
        Enum r7 = new Enum("CDMA", 4);
        Enum r9 = new Enum("EVDO_0", 5);
        Enum r11 = new Enum("EVDO_A", 6);
        Enum r13 = new Enum("RTT", 7);
        Enum r15 = new Enum("HSDPA", 8);
        Enum r14 = new Enum("HSUPA", 9);
        Enum r12 = new Enum("HSPA", 10);
        Enum r10 = new Enum("IDEN", 11);
        Enum r8 = new Enum("EVDO_B", 12);
        Enum r6 = new Enum("LTE", 13);
        Enum r4 = new Enum("EHRPD", 14);
        Enum r2 = new Enum("HSPAP", 15);
        Enum r62 = new Enum("GSM", 16);
        Enum r42 = new Enum("TD_SCDMA", 17);
        Enum r22 = new Enum("IWLAN", 18);
        Enum r63 = new Enum("LTE_CA", 19);
        f13696e = new EnumC6633e[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r14, r12, r10, r8, r6, r4, r2, r62, r42, r22, r63, new Enum("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f13697e = sparseArray;
        sparseArray.put(0, r0);
        sparseArray.put(1, r1);
        sparseArray.put(2, r3);
        sparseArray.put(3, r5);
        sparseArray.put(4, r7);
        sparseArray.put(5, r9);
        sparseArray.put(6, r11);
        sparseArray.put(7, r13);
        sparseArray.put(8, r15);
        sparseArray.put(9, r14);
        sparseArray.put(10, r12);
        sparseArray.put(11, r10);
        sparseArray.put(12, r8);
        sparseArray.put(13, r6);
        sparseArray.put(14, r4);
        sparseArray.put(15, r2);
        sparseArray.put(16, r62);
        sparseArray.put(17, r42);
        sparseArray.put(18, r22);
        sparseArray.put(19, r63);
    }

    public static EnumC6633e valueOf(String str) {
        return (EnumC6633e) Enum.valueOf(EnumC6633e.class, str);
    }

    public static EnumC6633e[] values() {
        return (EnumC6633e[]) f13696e.clone();
    }
}
