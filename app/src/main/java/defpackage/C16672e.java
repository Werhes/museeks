package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۨؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16672e extends C4491e {

    /* renamed from: eَؑۨ, reason: contains not printable characters */
    public static final String f32690e;

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public static final String f32691e;

    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public static final String f32692e;

    /* renamed from: eٍؖۙ, reason: contains not printable characters */
    public static final String f32693e;

    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public static final String f32694e;

    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public static final String f32695e;

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public static final C16672e f32696e = new C16672e(new C8756e());

    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public static final String f32697e;

    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public static final String f32698e;

    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public static final String f32699e;

    /* renamed from: eؙِۡ, reason: contains not printable characters */
    public static final String f32700e;

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public static final String f32701e;

    /* renamed from: eّْٝ, reason: contains not printable characters */
    public static final String f32702e;

    /* renamed from: eْۢؕ, reason: contains not printable characters */
    public static final String f32703e;

    /* renamed from: eٍٓۢ, reason: contains not printable characters */
    public static final String f32704e;

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public static final String f32705e;

    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public static final String f32706e;

    /* renamed from: eؘٖؗ, reason: contains not printable characters */
    public static final String f32707e;

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public static final String f32708e;

    /* renamed from: e٘ٔ٘, reason: contains not printable characters */
    public static final String f32709e;

    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    public final SparseArray f32710e;

    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public final boolean f32711e;

    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public final boolean f32712e;

    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public final boolean f32713e;

    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public final boolean f32714e;

    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public final SparseBooleanArray f32715e;

    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public final boolean f32716e;

    /* renamed from: eّٔؖ, reason: contains not printable characters */
    public final boolean f32717e;

    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public final boolean f32718e;

    static {
        String str = AbstractC9413e.ad;
        f32698e = Integer.toString(1000, 36);
        f32692e = Integer.toString(1001, 36);
        f32695e = Integer.toString(1002, 36);
        f32706e = Integer.toString(1003, 36);
        f32694e = Integer.toString(1004, 36);
        f32709e = Integer.toString(1005, 36);
        f32699e = Integer.toString(1006, 36);
        f32702e = Integer.toString(1007, 36);
        f32707e = Integer.toString(1008, 36);
        f32690e = Integer.toString(1009, 36);
        f32697e = Integer.toString(1010, 36);
        f32704e = Integer.toString(1011, 36);
        f32700e = Integer.toString(1012, 36);
        f32703e = Integer.toString(1013, 36);
        f32693e = Integer.toString(1014, 36);
        f32705e = Integer.toString(1015, 36);
        f32691e = Integer.toString(1016, 36);
        f32701e = Integer.toString(1017, 36);
        f32708e = Integer.toString(1018, 36);
    }

    public C16672e(C8756e c8756e) {
        super(c8756e);
        this.f32714e = c8756e.f17657native;
        this.f32711e = c8756e.f17656extends;
        this.f32717e = c8756e.f17659throw;
        this.f32718e = c8756e.f17661while;
        this.f32712e = c8756e.f17660try;
        this.f32713e = c8756e.f17658protected;
        this.f32716e = c8756e.f17654break;
        this.f32710e = c8756e.f17653abstract;
        this.f32715e = c8756e.f17655default;
    }

    @Override // defpackage.C4491e
    public final C14142e ad() {
        return new C8756e(this);
    }

    @Override // defpackage.C4491e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16672e.class == obj.getClass()) {
            C16672e c16672e = (C16672e) obj;
            if (super.equals(c16672e) && this.f32714e == c16672e.f32714e && this.f32711e == c16672e.f32711e && this.f32717e == c16672e.f32717e && this.f32718e == c16672e.f32718e && this.f32712e == c16672e.f32712e && this.f32713e == c16672e.f32713e && this.f32716e == c16672e.f32716e) {
                SparseBooleanArray sparseBooleanArray = c16672e.f32715e;
                SparseBooleanArray sparseBooleanArray2 = this.f32715e;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = c16672e.f32710e;
                            SparseArray sparseArray2 = this.f32710e;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                C12931e c12931e = (C12931e) entry.getKey();
                                                if (map2.containsKey(c12931e) && Objects.equals(entry.getValue(), map2.get(c12931e))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.C4491e
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f32714e ? 1 : 0)) * 961) + (this.f32711e ? 1 : 0)) * 961) + (this.f32717e ? 1 : 0)) * 28629151) + (this.f32718e ? 1 : 0)) * 31) + (this.f32712e ? 1 : 0)) * 31) + (this.f32713e ? 1 : 0)) * 961) + (this.f32716e ? 1 : 0)) * 31;
    }

    @Override // defpackage.C4491e
    public final Bundle metrica() {
        Bundle metrica = super.metrica();
        metrica.putBoolean(f32698e, this.f32714e);
        metrica.putBoolean(f32692e, false);
        metrica.putBoolean(f32695e, this.f32711e);
        metrica.putBoolean(f32693e, false);
        metrica.putBoolean(f32706e, this.f32717e);
        metrica.putBoolean(f32694e, false);
        metrica.putBoolean(f32709e, false);
        metrica.putBoolean(f32699e, false);
        metrica.putBoolean(f32705e, false);
        metrica.putBoolean(f32708e, this.f32718e);
        metrica.putBoolean(f32691e, this.f32712e);
        metrica.putBoolean(f32702e, this.f32713e);
        metrica.putBoolean(f32707e, false);
        metrica.putBoolean(f32690e, this.f32716e);
        metrica.putBoolean(f32701e, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.f32710e;
            if (i >= sparseArray2.size()) {
                SparseBooleanArray sparseBooleanArray = this.f32715e;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                    iArr[i2] = sparseBooleanArray.keyAt(i2);
                }
                metrica.putIntArray(f32703e, iArr);
                return metrica;
            }
            int keyAt = sparseArray2.keyAt(i);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                arrayList2.add((C12931e) entry.getKey());
                arrayList.add(Integer.valueOf(keyAt));
            }
            metrica.putIntArray(f32697e, AbstractC10509e.Signature(arrayList));
            metrica.putParcelableArrayList(f32704e, AbstractC5092e.billing(arrayList2, new C10612e(3)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            if (sparseArray.size() > 0) {
                sparseArray.keyAt(0);
                AbstractC1786e.applovin(sparseArray.valueAt(0));
                throw null;
            }
            metrica.putSparseParcelableArray(f32700e, sparseArray3);
            i++;
        }
    }
}
