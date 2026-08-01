package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Range;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10379e implements InterfaceC10383e, InterfaceC16112e, InterfaceC5283e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f20507e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f20508e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f20509e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f20510e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20511e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f20512e;

    public C10379e(int i) {
        this.f20511e = i;
        switch (i) {
            case 4:
                return;
            default:
                this.f20508e = new HashSet();
                this.f20510e = C4069e.license();
                this.f20509e = -1;
                this.f20507e = new ArrayList();
                this.f20512e = C5489e.ad();
                return;
        }
    }

    public C10379e(C3895e c3895e) {
        this.f20511e = 2;
        this.f20508e = c3895e;
        C11498e c11498e = AbstractC13939e.ad;
        c11498e.getClass();
        this.f20509e = C11498e.vip.incrementAndGet(c11498e);
        this.f20510e = AbstractC14430e.metrica(false);
        this.f20507e = new ArrayList();
        this.f20512e = new C6594e(14, this);
    }

    public C10379e(C6928e c6928e, int i) {
        this.f20511e = 7;
        this.f20512e = c6928e;
        this.f20508e = new C2125e(5, new byte[5]);
        this.f20510e = new SparseArray();
        this.f20507e = new SparseIntArray();
        this.f20509e = i;
    }

    public C10379e(C7370e c7370e, EnumC7709e enumC7709e, int i, Integer num, String str) {
        this.f20511e = 8;
        this.f20508e = c7370e;
        this.f20510e = enumC7709e;
        this.f20509e = i;
        this.f20507e = num;
        this.f20512e = str;
    }

    public C10379e(C10177e c10177e, C10182e c10182e, byte[] bArr, C13875e[] c13875eArr, int i) {
        this.f20511e = 9;
        this.f20508e = c10177e;
        this.f20510e = c10182e;
        this.f20507e = bArr;
        this.f20512e = c13875eArr;
        this.f20509e = i;
    }

    public C10379e(C11980e c11980e, InterfaceC7573e interfaceC7573e, InterfaceC3761e interfaceC3761e, int i) {
        this.f20511e = 3;
        this.f20508e = c11980e;
        this.f20510e = interfaceC7573e;
        this.f20509e = i;
        ArrayList typeParameters = interfaceC3761e.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.f20507e = linkedHashMap;
        this.f20512e = ((C6272e) ((C17241e) ((C11980e) this.f20508e).f23950e).ad).metrica(new C17877e(23, this));
    }

    public C10379e(C17974e c17974e, InterfaceC15348e interfaceC15348e, AbstractC8441e abstractC8441e, LongPointerWrapper longPointerWrapper) {
        this.f20511e = 5;
        this.f20508e = c17974e;
        this.f20510e = interfaceC15348e;
        this.f20507e = abstractC8441e;
        this.f20512e = longPointerWrapper;
    }

    public C10379e(C17980e c17980e, int i) {
        this.f20511e = 6;
        this.f20512e = c17980e;
        C16722e c16722e = new C16722e(10, false);
        c16722e.f32780e = r0;
        long[] jArr = {0, 0};
        c16722e.f32781e = false;
        jArr[1] = 4611686018427387904L;
        this.f20508e = c16722e;
        this.f20510e = new byte[i];
        this.f20507e = new long[i / 8];
    }

    public C10379e(C11443e[] c11443eArr, InterfaceC17119e[] interfaceC17119eArr, C18255e c18255e, Object obj) {
        this.f20511e = 0;
        AbstractC2301e.billing(c11443eArr.length == interfaceC17119eArr.length);
        this.f20508e = c11443eArr;
        this.f20510e = (InterfaceC17119e[]) interfaceC17119eArr.clone();
        this.f20507e = c18255e;
        this.f20512e = obj;
        this.f20509e = c11443eArr.length;
    }

    @Override // defpackage.InterfaceC5283e
    public void ad(C1292e c1292e) {
        C8010e c8010e;
        C8010e c8010e2;
        SparseArray sparseArray;
        int i;
        C2125e c2125e;
        char c;
        int i2;
        int i3;
        C8010e c8010e3;
        SparseArray sparseArray2 = (SparseArray) this.f20510e;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f20507e;
        C2125e c2125e2 = (C2125e) this.f20508e;
        C6928e c6928e = (C6928e) this.f20512e;
        SparseArray sparseArray3 = c6928e.yandex;
        SparseBooleanArray sparseBooleanArray = c6928e.startapp;
        C6233e c6233e = c6928e.purchase;
        List list = c6928e.metrica;
        int i4 = c6928e.ad;
        if (c1292e.ads() == 2) {
            if (i4 == 1 || i4 == 2 || c6928e.amazon == 1) {
                c8010e = (C8010e) list.get(0);
            } else {
                c8010e = new C8010e(((C8010e) list.get(0)).license());
                list.add(c8010e);
            }
            if ((c1292e.ads() & 128) != 0) {
                c1292e.m568protected(1);
                int m565goto = c1292e.m565goto();
                c1292e.m568protected(3);
                c1292e.mopub(0, 2, c2125e2.vip);
                c2125e2.smaato(0);
                c2125e2.loadAd(3);
                c6928e.pro = c2125e2.billing(13);
                c1292e.mopub(0, 2, c2125e2.vip);
                c2125e2.smaato(0);
                c2125e2.loadAd(4);
                c1292e.m568protected(c2125e2.billing(12));
                if (i4 == 2 && c6928e.subscription == null) {
                    InterfaceC15956e ad = c6233e.ad(21, new C9556e(21, null, 0, null, AbstractC9413e.vip));
                    c6928e.subscription = ad;
                    if (ad != null) {
                        ad.billing(c8010e, c6928e.smaato, new C18316e(m565goto, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int ad2 = c1292e.ad();
                while (ad2 > 0) {
                    c1292e.mopub(0, 5, c2125e2.vip);
                    c2125e2.smaato(0);
                    int billing = c2125e2.billing(8);
                    c2125e2.loadAd(3);
                    int billing2 = c2125e2.billing(13);
                    c2125e2.loadAd(4);
                    int billing3 = c2125e2.billing(12);
                    int i5 = c1292e.vip;
                    int i6 = i5 + billing3;
                    int i7 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i8 = 0;
                    int i9 = ad2;
                    while (true) {
                        if (c1292e.vip >= i6) {
                            c2125e = c2125e2;
                            break;
                        }
                        int ads = c1292e.ads();
                        c2125e = c2125e2;
                        int ads2 = c1292e.vip + c1292e.ads();
                        if (ads2 > i6) {
                            break;
                        }
                        SparseArray sparseArray4 = sparseArray3;
                        if (ads == 5) {
                            long subs = c1292e.subs();
                            if (subs == 1094921523) {
                                i7 = 129;
                            } else if (subs == 1161904947) {
                                i7 = 135;
                            } else {
                                if (subs != 1094921524) {
                                    if (subs == 1212503619) {
                                        i7 = 36;
                                    }
                                }
                                i7 = 172;
                            }
                            i2 = ads2;
                            i3 = m565goto;
                            c8010e3 = c8010e;
                        } else if (ads == 106) {
                            i2 = ads2;
                            i3 = m565goto;
                            c8010e3 = c8010e;
                            i7 = 129;
                        } else if (ads == 122) {
                            i3 = m565goto;
                            c8010e3 = c8010e;
                            i7 = 135;
                            i2 = ads2;
                        } else {
                            if (ads == 127) {
                                int ads3 = c1292e.ads();
                                if (ads3 != 21) {
                                    if (ads3 == 14) {
                                        i7 = 136;
                                    } else if (ads3 == 33) {
                                        i7 = 139;
                                    }
                                }
                                i7 = 172;
                            } else if (ads == 123) {
                                i7 = 138;
                            } else if (ads == 10) {
                                str = c1292e.isPro(3, StandardCharsets.UTF_8).trim();
                                i2 = ads2;
                                i8 = c1292e.ads();
                                i3 = m565goto;
                                c8010e3 = c8010e;
                            } else {
                                if (ads == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (c1292e.vip < ads2) {
                                        String trim = c1292e.isPro(3, StandardCharsets.UTF_8).trim();
                                        c1292e.ads();
                                        C8010e c8010e4 = c8010e;
                                        byte[] bArr = new byte[4];
                                        c1292e.mopub(0, 4, bArr);
                                        arrayList2.add(new C2938e(trim, bArr));
                                        c8010e = c8010e4;
                                        ads2 = ads2;
                                        m565goto = m565goto;
                                    }
                                    i2 = ads2;
                                    i3 = m565goto;
                                    c8010e3 = c8010e;
                                    arrayList = arrayList2;
                                    i7 = 89;
                                } else {
                                    i2 = ads2;
                                    i3 = m565goto;
                                    c8010e3 = c8010e;
                                    if (ads == 111) {
                                        i7 = 257;
                                    }
                                }
                                c1292e.m568protected(i2 - c1292e.vip);
                                c8010e = c8010e3;
                                c2125e2 = c2125e;
                                sparseArray3 = sparseArray4;
                                m565goto = i3;
                            }
                            i2 = ads2;
                            i3 = m565goto;
                            c8010e3 = c8010e;
                        }
                        c1292e.m568protected(i2 - c1292e.vip);
                        c8010e = c8010e3;
                        c2125e2 = c2125e;
                        sparseArray3 = sparseArray4;
                        m565goto = i3;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i10 = m565goto;
                    C8010e c8010e5 = c8010e;
                    c1292e.m571try(i6);
                    C9556e c9556e = new C9556e(i7, str, i8, arrayList, Arrays.copyOfRange(c1292e.ad, i5, i6));
                    if (billing == 6 || billing == 5) {
                        billing = i7;
                    }
                    int i11 = i9 - (billing3 + 5);
                    int i12 = i4 == 2 ? billing : billing2;
                    if (sparseBooleanArray.get(i12)) {
                        c = 21;
                    } else {
                        c = 21;
                        InterfaceC15956e ad3 = (i4 == 2 && billing == 21) ? c6928e.subscription : c6233e.ad(billing, c9556e);
                        if (i4 != 2 || billing2 < sparseIntArray.get(i12, 8192)) {
                            sparseIntArray.put(i12, billing2);
                            sparseArray2.put(i12, ad3);
                        }
                    }
                    ad2 = i11;
                    c8010e = c8010e5;
                    c2125e2 = c2125e;
                    sparseArray3 = sparseArray5;
                    m565goto = i10;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i13 = m565goto;
                C8010e c8010e6 = c8010e;
                int size = sparseIntArray.size();
                int i14 = 0;
                while (i14 < size) {
                    int keyAt = sparseIntArray.keyAt(i14);
                    int valueAt = sparseIntArray.valueAt(i14);
                    sparseBooleanArray.put(keyAt, true);
                    c6928e.adcel.put(valueAt, true);
                    InterfaceC15956e interfaceC15956e = (InterfaceC15956e) sparseArray2.valueAt(i14);
                    if (interfaceC15956e != null) {
                        if (interfaceC15956e != c6928e.subscription) {
                            i = i13;
                            c8010e2 = c8010e6;
                            interfaceC15956e.billing(c8010e2, c6928e.smaato, new C18316e(i, keyAt, 8192));
                        } else {
                            c8010e2 = c8010e6;
                            i = i13;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, interfaceC15956e);
                    } else {
                        c8010e2 = c8010e6;
                        sparseArray = sparseArray6;
                        i = i13;
                    }
                    i14++;
                    sparseArray6 = sparseArray;
                    i13 = i;
                    c8010e6 = c8010e2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i4 == 2) {
                    if (c6928e.loadAd) {
                        return;
                    }
                    c6928e.smaato.mopub();
                    c6928e.amazon = 0;
                    c6928e.loadAd = true;
                    return;
                }
                sparseArray7.remove(this.f20509e);
                int i15 = i4 == 1 ? 0 : c6928e.amazon - 1;
                c6928e.amazon = i15;
                if (i15 == 0) {
                    c6928e.smaato.mopub();
                    c6928e.loadAd = true;
                }
            }
        }
    }

    public void adcel() {
        List<InterfaceC15648e> m3575continue;
        synchronized (((ArrayList) this.f20507e)) {
            m3575continue = AbstractC13480e.m3575continue((ArrayList) this.f20507e);
            ((ArrayList) this.f20507e).clear();
        }
        for (InterfaceC15648e interfaceC15648e : m3575continue) {
            Trace.beginSection("InvokeInternalListeners");
            C4780e c4780e = (C4780e) interfaceC15648e;
            int size = c4780e.license.size();
            for (int i = 0; i < size; i++) {
                InterfaceC9610e interfaceC9610e = (InterfaceC9610e) c4780e.license.get(i);
                int size2 = c4780e.appmetrica.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((InterfaceC1926e) c4780e.appmetrica.get(i2)).mo732protected(interfaceC9610e.license());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = c4780e.license.size();
            for (int i3 = 0; i3 < size3; i3++) {
                InterfaceC9610e interfaceC9610e2 = (InterfaceC9610e) c4780e.license.get(i3);
                int size4 = interfaceC9610e2.license().license.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((InterfaceC1926e) interfaceC9610e2.license().license.get(i4)).mo732protected(interfaceC9610e2.license());
                }
            }
            Trace.endSection();
        }
        ((C3895e) this.f20508e).ad();
    }

    public void amazon(AbstractC1037e abstractC1037e) {
        ArrayList arrayList = (ArrayList) this.f20507e;
        if (arrayList.contains(abstractC1037e)) {
            return;
        }
        arrayList.add(abstractC1037e);
    }

    public Range applovin() {
        return (Range) ((C4069e) this.f20510e).smaato(C9937e.purchase, C6884e.yandex);
    }

    @Override // defpackage.InterfaceC5283e
    public void billing(C8010e c8010e, InterfaceC5483e interfaceC5483e, C18316e c18316e) {
    }

    /* renamed from: break, reason: not valid java name */
    public void m2801break(byte[] bArr, int i, int i2, long[] jArr) {
        C16722e c16722e = (C16722e) this.f20508e;
        int i3 = 0;
        while (i2 > i3) {
            if (this.f20509e == ((byte[]) this.f20510e).length) {
                m2802extends(jArr);
                long[] jArr2 = (long[]) c16722e.f32780e;
                jArr2[1] = jArr2[1] & (-4611686018427387905L);
                this.f20509e = 0;
            }
            int min = Math.min(i2 - i3, ((byte[]) this.f20510e).length - this.f20509e);
            System.arraycopy(bArr, i + i3, (byte[]) this.f20510e, this.f20509e, min);
            i3 += min;
            this.f20509e += min;
            if (c16722e.f32781e) {
                long[] jArr3 = new long[3];
                long[] jArr4 = (long[]) c16722e.f32780e;
                jArr3[0] = jArr4[0] & 4294967295L;
                jArr3[1] = (jArr4[0] >>> 32) & 4294967295L;
                jArr3[2] = jArr4[1] & 4294967295L;
                long j = min;
                for (int i4 = 0; i4 < 3; i4++) {
                    long j2 = j + jArr3[i4];
                    jArr3[i4] = j2;
                    j = j2 >>> 32;
                }
                long[] jArr5 = (long[]) c16722e.f32780e;
                jArr5[0] = ((jArr3[1] & 4294967295L) << 32) | (jArr3[0] & 4294967295L);
                jArr5[1] = (jArr3[2] & 4294967295L) | (jArr5[1] & (-4294967296L));
            } else {
                long[] jArr6 = (long[]) c16722e.f32780e;
                long j3 = jArr6[0] + min;
                jArr6[0] = j3;
                if (j3 > 9223372034707292160L) {
                    c16722e.f32781e = true;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC16112e
    public void clear() {
        AbstractC0054e.license(this);
    }

    @Override // defpackage.InterfaceC16112e
    public boolean contains(Object obj) {
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = ((AbstractC8441e) this.f20507e).metrica(c15816e, obj);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f20512e).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_find(ptr$cinterop_release, metrica.ad, metrica, new long[1], zArr);
        boolean z = zArr[0];
        c15816e.m4020interface();
        return z;
    }

    @Override // defpackage.InterfaceC16112e
    public boolean crashlytics(Object obj, int i, LinkedHashMap linkedHashMap) {
        boolean signatures = signatures(obj, i, linkedHashMap);
        purchase(startapp() + 1);
        return signatures;
    }

    /* renamed from: extends, reason: not valid java name */
    public void m2802extends(long[] jArr) {
        C17980e c17980e = (C17980e) this.f20512e;
        C6213e c6213e = c17980e.f35269e;
        c6213e.ad(true, c17980e.f35264e, (long[]) ((C16722e) this.f20508e).f32780e);
        AbstractC3628e.Signature(0, (byte[]) this.f20510e, (long[]) this.f20507e);
        c6213e.vip((long[]) this.f20507e, jArr);
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = jArr[i] ^ ((long[]) this.f20507e)[i];
        }
    }

    @Override // defpackage.InterfaceC16112e
    public Object get(int i) {
        AbstractC8441e abstractC8441e = (AbstractC8441e) this.f20507e;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f20512e;
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_set_get(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        return abstractC8441e.license(realm_value_tVar);
    }

    @Override // defpackage.InterfaceC16112e
    /* renamed from: goto */
    public boolean mo2159goto(InterfaceC11775e interfaceC11775e, int i, Map map) {
        return AbstractC0054e.ad(this, interfaceC11775e, i, map);
    }

    /* renamed from: interface, reason: not valid java name */
    public boolean m2803interface(int i) {
        return ((C11443e[]) this.f20508e)[i] != null;
    }

    public void isPro(long[] jArr) {
        int i = this.f20509e;
        while (true) {
            byte[] bArr = (byte[]) this.f20510e;
            if (i >= bArr.length) {
                long[] jArr2 = (long[]) ((C16722e) this.f20508e).f32780e;
                jArr2[1] = jArr2[1] | Long.MIN_VALUE;
                m2802extends(jArr);
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.InterfaceC10383e
    public InterfaceC16046e license(C0317e c0317e) {
        C7232e c7232e = (C7232e) ((C8286e) this.f20512e).invoke(c0317e);
        return c7232e != null ? c7232e : ((InterfaceC10383e) ((C11980e) this.f20508e).f23949e).license(c0317e);
    }

    @Override // defpackage.InterfaceC16112e
    public InterfaceC16112e metrica(InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        return new C10379e((C17974e) this.f20508e, interfaceC15348e, (AbstractC8441e) this.f20507e, longPointerWrapper);
    }

    public void mopub(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            amazon((AbstractC1037e) it.next());
        }
    }

    public void pro(InterfaceC12330e interfaceC12330e) {
        for (C14326e c14326e : interfaceC12330e.admob()) {
            ((C4069e) this.f20510e).smaato(c14326e, null);
            ((C4069e) this.f20510e).billing(c14326e, interfaceC12330e.mo810catch(c14326e), interfaceC12330e.subscription(c14326e));
        }
    }

    /* renamed from: protected, reason: not valid java name */
    public boolean m2804protected(boolean z, List list, Map map, Map map2, Map map3, List list2) {
        boolean z2;
        boolean z3;
        if (((C2673e) this.f20510e).vip()) {
            Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            C4780e metrica = ((C3895e) this.f20508e).metrica(z, list, map, map2, map3, (C6594e) this.f20512e, list2);
            if (metrica == null) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C9021e) it.next()).getClass();
                    }
                }
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " failed to build CaptureSequence.");
                return false;
            }
            if (((C2673e) this.f20510e).vip()) {
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
                return false;
            }
            if (!metrica.vip) {
                synchronized (((ArrayList) this.f20507e)) {
                    ((ArrayList) this.f20507e).add(metrica);
                }
            }
            try {
                Log.d("CXCP", this + " submitting " + metrica);
                Trace.beginSection("InvokeInternalListeners");
                int size = metrica.license.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC9610e interfaceC9610e = (InterfaceC9610e) metrica.license.get(i);
                    int size2 = metrica.appmetrica.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC1926e) metrica.appmetrica.get(i2)).advert(interfaceC9610e);
                    }
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = metrica.license.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC9610e interfaceC9610e2 = (InterfaceC9610e) metrica.license.get(i3);
                    int size4 = interfaceC9610e2.license().license.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((InterfaceC1926e) interfaceC9610e2.license().license.get(i4)).advert(interfaceC9610e2);
                    }
                }
            } catch (CameraAccessException unused) {
                if (!metrica.vip) {
                    synchronized (((ArrayList) this.f20507e)) {
                        ((ArrayList) this.f20507e).remove(metrica);
                        Trace.beginSection("InvokeInternalListeners");
                        int size5 = metrica.license.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            InterfaceC9610e interfaceC9610e3 = (InterfaceC9610e) metrica.license.get(i5);
                            int size6 = metrica.appmetrica.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                ((InterfaceC1926e) metrica.appmetrica.get(i6)).mo732protected(interfaceC9610e3.license());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size7 = metrica.license.size();
                        for (int i7 = 0; i7 < size7; i7++) {
                            InterfaceC9610e interfaceC9610e4 = (InterfaceC9610e) metrica.license.get(i7);
                            int size8 = interfaceC9610e4.license().license.size();
                            for (int i8 = 0; i8 < size8; i8++) {
                                ((InterfaceC1926e) interfaceC9610e4.license().license.get(i8)).mo732protected(interfaceC9610e4.license());
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                z2 = false;
            }
            synchronized (metrica) {
                if (!((C2673e) this.f20510e).vip()) {
                    try {
                        Trace.beginSection("CXCP#submit(CaptureSequence)");
                        Integer appmetrica = ((C3895e) this.f20508e).appmetrica(metrica);
                        int intValue = appmetrica != null ? appmetrica.intValue() : -1;
                        metrica.smaato = Integer.valueOf(intValue);
                        if (intValue != -1) {
                            Trace.beginSection("InvokeInternalListeners");
                            int size9 = metrica.license.size();
                            for (int i9 = 0; i9 < size9; i9++) {
                                InterfaceC9610e interfaceC9610e5 = (InterfaceC9610e) metrica.license.get(i9);
                                int size10 = metrica.appmetrica.size();
                                for (int i10 = 0; i10 < size10; i10++) {
                                    ((InterfaceC1926e) metrica.appmetrica.get(i10)).subs(interfaceC9610e5);
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size11 = metrica.license.size();
                            for (int i11 = 0; i11 < size11; i11++) {
                                InterfaceC9610e interfaceC9610e6 = (InterfaceC9610e) metrica.license.get(i11);
                                int size12 = interfaceC9610e6.license().license.size();
                                for (int i12 = 0; i12 < size12; i12++) {
                                    ((InterfaceC1926e) interfaceC9610e6.license().license.get(i12)).subs(interfaceC9610e6);
                                }
                            }
                            z2 = true;
                            try {
                                Log.d("CXCP", this + " submitted " + metrica);
                                z3 = true;
                            } catch (CameraAccessException unused2) {
                            } catch (Throwable th2) {
                                th = th2;
                                if (!z2 && !metrica.vip) {
                                    synchronized (((ArrayList) this.f20507e)) {
                                        ((ArrayList) this.f20507e).remove(metrica);
                                    }
                                    Trace.beginSection("InvokeInternalListeners");
                                    int size13 = metrica.license.size();
                                    for (int i13 = 0; i13 < size13; i13++) {
                                        InterfaceC9610e interfaceC9610e7 = (InterfaceC9610e) metrica.license.get(i13);
                                        int size14 = metrica.appmetrica.size();
                                        for (int i14 = 0; i14 < size14; i14++) {
                                            ((InterfaceC1926e) metrica.appmetrica.get(i14)).mo732protected(interfaceC9610e7.license());
                                        }
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("InvokeRequestListeners");
                                    int size15 = metrica.license.size();
                                    for (int i15 = 0; i15 < size15; i15++) {
                                        InterfaceC9610e interfaceC9610e8 = (InterfaceC9610e) metrica.license.get(i15);
                                        int size16 = interfaceC9610e8.license().license.size();
                                        for (int i16 = 0; i16 < size16; i16++) {
                                            ((InterfaceC1926e) interfaceC9610e8.license().license.get(i16)).mo732protected(interfaceC9610e8.license());
                                        }
                                    }
                                }
                                throw th;
                            }
                        } else {
                            Log.w("CXCP", "Failed to submit " + metrica + ": " + this + " received -1 from submit.");
                            z3 = false;
                            z2 = false;
                        }
                        if (z3 || metrica.vip) {
                            return z2;
                        }
                        synchronized (((ArrayList) this.f20507e)) {
                            ((ArrayList) this.f20507e).remove(metrica);
                        }
                        Trace.beginSection("InvokeInternalListeners");
                        int size17 = metrica.license.size();
                        for (int i17 = 0; i17 < size17; i17++) {
                            InterfaceC9610e interfaceC9610e9 = (InterfaceC9610e) metrica.license.get(i17);
                            int size18 = metrica.appmetrica.size();
                            for (int i18 = 0; i18 < size18; i18++) {
                                ((InterfaceC1926e) metrica.appmetrica.get(i18)).mo732protected(interfaceC9610e9.license());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size19 = metrica.license.size();
                        for (int i19 = 0; i19 < size19; i19++) {
                            InterfaceC9610e interfaceC9610e10 = (InterfaceC9610e) metrica.license.get(i19);
                            int size20 = interfaceC9610e10.license().license.size();
                            for (int i20 = 0; i20 < size20; i20++) {
                                ((InterfaceC1926e) interfaceC9610e10.license().license.get(i20)).mo732protected(interfaceC9610e10.license());
                            }
                        }
                        return z2;
                    } finally {
                    }
                }
                Log.w("CXCP", "Failed to submit " + metrica + ": " + this + " is closed.");
                if (!metrica.vip) {
                    synchronized (((ArrayList) this.f20507e)) {
                        ((ArrayList) this.f20507e).remove(metrica);
                    }
                    Trace.beginSection("InvokeInternalListeners");
                    int size21 = metrica.license.size();
                    for (int i21 = 0; i21 < size21; i21++) {
                        InterfaceC9610e interfaceC9610e11 = (InterfaceC9610e) metrica.license.get(i21);
                        int size22 = metrica.appmetrica.size();
                        for (int i22 = 0; i22 < size22; i22++) {
                            ((InterfaceC1926e) metrica.appmetrica.get(i22)).mo732protected(interfaceC9610e11.license());
                        }
                    }
                    Trace.endSection();
                    Trace.beginSection("InvokeRequestListeners");
                    int size23 = metrica.license.size();
                    for (int i23 = 0; i23 < size23; i23++) {
                        InterfaceC9610e interfaceC9610e12 = (InterfaceC9610e) metrica.license.get(i23);
                        int size24 = interfaceC9610e12.license().license.size();
                        for (int i24 = 0; i24 < size24; i24++) {
                            ((InterfaceC1926e) interfaceC9610e12.license().license.get(i24)).mo732protected(interfaceC9610e12.license());
                        }
                    }
                    return false;
                }
                return false;
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.InterfaceC16112e
    public void purchase(int i) {
        this.f20509e = i;
    }

    @Override // defpackage.InterfaceC16112e
    public boolean remoteconfig(Collection collection, int i, Map map) {
        return AbstractC0054e.vip(this, collection, i, map);
    }

    @Override // defpackage.InterfaceC16112e
    public boolean remove(Object obj) {
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = ((AbstractC8441e) this.f20507e).metrica(c15816e, obj);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f20512e).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_erase(ptr$cinterop_release, metrica.ad, metrica, zArr);
        boolean z = zArr[0];
        c15816e.m4020interface();
        purchase(startapp() + 1);
        return z;
    }

    @Override // defpackage.InterfaceC16112e
    public boolean removeAll(Collection collection) {
        return AbstractC0054e.amazon(this, collection);
    }

    @Override // defpackage.InterfaceC16112e
    public boolean signatures(Object obj, int i, Map map) {
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = ((AbstractC8441e) this.f20507e).metrica(c15816e, obj);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f20512e).getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_set_insert(ptr$cinterop_release, metrica.ad, metrica, new long[1], zArr);
        boolean z = zArr[0];
        c15816e.m4020interface();
        return z;
    }

    @Override // defpackage.InterfaceC16112e
    public int startapp() {
        return this.f20509e;
    }

    public boolean subs(C10379e c10379e, int i) {
        return c10379e != null && Objects.equals(((C11443e[]) this.f20508e)[i], ((C11443e[]) c10379e.f20508e)[i]) && Objects.equals(((InterfaceC17119e[]) this.f20510e)[i], ((InterfaceC17119e[]) c10379e.f20510e)[i]);
    }

    public C9937e tapsense() {
        ArrayList arrayList = new ArrayList((HashSet) this.f20508e);
        C17015e vip = C17015e.vip((C4069e) this.f20510e);
        int i = this.f20509e;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f20507e);
        C5489e c5489e = (C5489e) this.f20512e;
        C18543e c18543e = C18543e.vip;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c5489e.ad.keySet()) {
            arrayMap.put(str, c5489e.ad.get(str));
        }
        return new C9937e(arrayList, vip, i, arrayList2, new C18543e(arrayMap));
    }

    /* renamed from: this, reason: not valid java name */
    public void m2805this(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = (byte[]) this.f20507e;
        byte[] bArr4 = (byte[]) this.f20510e;
        int i2 = this.f20509e;
        if (i + i2 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        ((InterfaceC2227e) this.f20512e).tapsense(0, 0, bArr4, bArr3);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
        }
        System.arraycopy(bArr4, i2, bArr4, 0, bArr4.length - i2);
        System.arraycopy(bArr2, 0, bArr4, bArr4.length - i2, i2);
    }

    public String toString() {
        String str;
        switch (this.f20511e) {
            case 2:
                return "GraphRequestProcessor-" + this.f20509e;
            case 8:
                String str2 = (String) this.f20512e;
                StringBuilder sb = new StringBuilder("since ");
                sb.append((C7370e) this.f20508e);
                sb.append(' ');
                int i = this.f20509e;
                sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "HIDDEN" : "ERROR" : "WARNING");
                Integer num = (Integer) this.f20507e;
                String str3 = BuildConfig.FLAVOR;
                if (num != null) {
                    str = " error " + num.intValue();
                } else {
                    str = BuildConfig.FLAVOR;
                }
                sb.append(str);
                if (str2 != null) {
                    str3 = ": ".concat(str2);
                }
                sb.append(str3);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: try, reason: not valid java name */
    public void m2806try() {
        C3895e c3895e = (C3895e) this.f20508e;
        synchronized (c3895e.adcel) {
            Log.d("CXCP", c3895e + "#stopRepeating");
            c3895e.ad.mo1018throws();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC16112e
    public NativePointer vip() {
        return (LongPointerWrapper) this.f20512e;
    }

    /* renamed from: while, reason: not valid java name */
    public Unit m2807while() {
        Log.d("CXCP", "Closing " + this);
        if (!((C2673e) this.f20510e).ad()) {
            return Unit.INSTANCE;
        }
        ((C3895e) this.f20508e).license();
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC2750e
    public InterfaceC15348e yandex() {
        return (InterfaceC15348e) this.f20510e;
    }
}
