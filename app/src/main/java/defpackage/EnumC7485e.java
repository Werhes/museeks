package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7485e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7485e[] f15254e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final SparseArray f15255e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7485e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Enum r0 = new Enum("MOBILE", 0);
        Enum r1 = new Enum("WIFI", 1);
        Enum r3 = new Enum("MOBILE_MMS", 2);
        Enum r5 = new Enum("MOBILE_SUPL", 3);
        Enum r7 = new Enum("MOBILE_DUN", 4);
        Enum r9 = new Enum("MOBILE_HIPRI", 5);
        Enum r11 = new Enum("WIMAX", 6);
        Enum r13 = new Enum("BLUETOOTH", 7);
        Enum r15 = new Enum("DUMMY", 8);
        Enum r14 = new Enum("ETHERNET", 9);
        Enum r12 = new Enum("MOBILE_FOTA", 10);
        Enum r10 = new Enum("MOBILE_IMS", 11);
        Enum r8 = new Enum("MOBILE_CBS", 12);
        Enum r6 = new Enum("WIFI_P2P", 13);
        Enum r4 = new Enum("MOBILE_IA", 14);
        Enum r2 = new Enum("MOBILE_EMERGENCY", 15);
        Enum r62 = new Enum("PROXY", 16);
        Enum r42 = new Enum("VPN", 17);
        Enum r22 = new Enum("NONE", 18);
        f15254e = new EnumC7485e[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r14, r12, r10, r8, r6, r4, r2, r62, r42, r22};
        SparseArray sparseArray = new SparseArray();
        f15255e = sparseArray;
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
        sparseArray.put(-1, r22);
    }

    public static EnumC7485e valueOf(String str) {
        return (EnumC7485e) Enum.valueOf(EnumC7485e.class, str);
    }

    public static EnumC7485e[] values() {
        return (EnumC7485e[]) f15254e.clone();
    }
}
