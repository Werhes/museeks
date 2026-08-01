package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۨۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6096e implements InterfaceC14128e, Closeable {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final TreeMap f12762e = new TreeMap();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[][] f12763e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final double[] f12764e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long[] f12765e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f12766e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String[] f12767e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile String f12768e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f12769e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f12770e;

    public C6096e(int i) {
        this.f12769e = i;
        int i2 = i + 1;
        this.f12770e = new int[i2];
        this.f12765e = new long[i2];
        this.f12764e = new double[i2];
        this.f12767e = new String[i2];
        this.f12763e = new byte[i2];
    }

    public static C6096e purchase(int i, String str) {
        TreeMap treeMap = f12762e;
        synchronized (treeMap) {
            try {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry == null) {
                    C6096e c6096e = new C6096e(i);
                    c6096e.f12768e = str;
                    c6096e.f12766e = i;
                    return c6096e;
                }
                treeMap.remove(ceilingEntry.getKey());
                C6096e c6096e2 = (C6096e) ceilingEntry.getValue();
                c6096e2.f12768e = str;
                c6096e2.f12766e = i;
                return c6096e2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Signature(int i, String str) {
        this.f12770e[i] = 4;
        this.f12767e[i] = str;
    }

    @Override // defpackage.InterfaceC14128e
    public final void ad(C4734e c4734e) {
        for (int i = 1; i <= this.f12766e; i++) {
            int i2 = this.f12770e[i];
            if (i2 == 1) {
                c4734e.advert(i);
            } else if (i2 == 2) {
                c4734e.purchase(i, this.f12765e[i]);
            } else if (i2 == 3) {
                ((SQLiteProgram) c4734e.f10118e).bindDouble(i, this.f12764e[i]);
            } else if (i2 == 4) {
                c4734e.loadAd(i, this.f12767e[i]);
            } else if (i2 == 5) {
                c4734e.license(i, this.f12763e[i]);
            }
        }
    }

    public final void advert(int i, long j) {
        this.f12770e[i] = 2;
        this.f12765e[i] = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void isVip() {
        TreeMap treeMap = f12762e;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f12769e), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC14128e
    public final String license() {
        return this.f12768e;
    }

    public final void loadAd(int i) {
        this.f12770e[i] = 1;
    }
}
