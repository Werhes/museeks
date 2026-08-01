package defpackage;

import android.content.Context;
import android.os.Looper;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_binary_t;
import io.realm.kotlin.internal.interop.realm_decimal128_t;
import io.realm.kotlin.internal.interop.realm_object_id_t;
import io.realm.kotlin.internal.interop.realm_uuid_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.mongodb.kbson.BsonObjectId$Companion;

/* renamed from: eؙۘۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6613e implements InterfaceC17128e, InterfaceC12556e, InterfaceC2227e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final byte[] f13639e = {-90, -90, -90, -90, -90, -90, -90, -90};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f13640e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f13641e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f13642e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f13643e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13644e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f13645e;

    public C6613e(int i) {
        this.f13644e = 2;
        long[] jArr = new long[i];
        this.f13643e = jArr;
        boolean[] zArr = new boolean[i];
        this.f13640e = zArr;
        this.f13645e = new int[i];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    public C6613e(Context context, Looper looper, C17381e c17381e, int i) {
        this.f13644e = i;
        switch (i) {
            case 6:
                this.f13643e = new C11883e(context.getApplicationContext(), 28);
                this.f13640e = c17381e.ad(looper, null);
                this.f13645e = c17381e.ad(Looper.getMainLooper(), null);
                return;
            default:
                this.f13643e = new C7302e(0, context.getApplicationContext());
                this.f13640e = c17381e.ad(looper, null);
                this.f13645e = c17381e.ad(Looper.getMainLooper(), null);
                return;
        }
    }

    public C6613e(InterfaceC2227e interfaceC2227e) {
        this.f13644e = 0;
        this.f13640e = new byte[8];
        this.f13645e = null;
        this.f13641e = true;
        this.f13643e = interfaceC2227e;
        this.f13642e = true;
    }

    public C6613e(C4602e c4602e, InterfaceC16718e interfaceC16718e, InterfaceC8246e interfaceC8246e) {
        this.f13644e = 1;
        this.f13643e = c4602e;
        this.f13640e = interfaceC16718e;
        this.f13645e = interfaceC8246e;
    }

    public C6613e(InterfaceC15633e interfaceC15633e, boolean z, C11980e c11980e, EnumC13937e enumC13937e, boolean z2) {
        this.f13644e = 4;
        this.f13643e = interfaceC15633e;
        this.f13642e = z;
        this.f13640e = c11980e;
        this.f13645e = enumC13937e;
        this.f13641e = z2;
    }

    public C6613e(C17974e c17974e, InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper, boolean z, boolean z2) {
        this.f13644e = 3;
        new LinkedHashMap();
        this.f13643e = c17974e;
        this.f13640e = interfaceC15348e;
        this.f13645e = longPointerWrapper;
        this.f13642e = z;
        this.f13641e = z2;
    }

    public static IOException ad(C6613e c6613e, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            c6613e.m2233abstract(iOException);
        }
        return ((C4602e) c6613e.f13643e).startapp(c6613e, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public static int adcel(int i, byte[] bArr) {
        int i2 = ((bArr[i + 1] & 255) << 16) | (bArr[i] << 24);
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: default, reason: not valid java name */
    public static void m2232default(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void mopub(Object obj, ArrayList arrayList, C17877e c17877e) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) c17877e.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                mopub(it.next(), arrayList, c17877e);
            }
        }
    }

    public static EnumC7701e subs(InterfaceC9905e interfaceC9905e) {
        AbstractC10226e billing;
        AbstractC10226e billing2;
        AbstractC14773e purchase = AbstractC0083e.purchase(interfaceC9905e);
        if (purchase == null || (billing = AbstractC0083e.m252try(purchase)) == null) {
            billing = AbstractC0083e.billing(interfaceC9905e);
        }
        if (AbstractC0083e.m234class(billing)) {
            return EnumC7701e.f15627e;
        }
        AbstractC14773e purchase2 = AbstractC0083e.purchase(interfaceC9905e);
        if (purchase2 == null || (billing2 = AbstractC0083e.m245private(purchase2)) == null) {
            billing2 = AbstractC0083e.billing(interfaceC9905e);
        }
        if (AbstractC0083e.m234class(billing2)) {
            return null;
        }
        return EnumC7701e.f15626e;
    }

    /* renamed from: abstract, reason: not valid java name */
    public void m2233abstract(IOException iOException) {
        this.f13641e = true;
        ((InterfaceC8246e) this.f13645e).startapp().vip((C4602e) this.f13643e, iOException);
    }

    @Override // defpackage.InterfaceC12556e
    /* renamed from: amazon, reason: merged with bridge method [inline-methods] */
    public InterfaceC5045e get(int i) {
        int i2;
        InterfaceC7227e interfaceC7227e;
        InterfaceC7227e vip;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f13645e;
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i3 = AbstractC6026e.ad;
        realmcJNI.realm_list_get(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        C17974e c17974e = (C17974e) this.f13643e;
        InterfaceC15348e interfaceC15348e = (InterfaceC15348e) this.f13640e;
        boolean z = this.f13642e;
        boolean z2 = this.f13641e;
        int i4 = 0;
        boolean z3 = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0;
        if (z3) {
            return null;
        }
        if (z3) {
            throw new C14803e(10);
        }
        int realm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar);
        int[] m2468interface = AbstractC8703e.m2468interface(14);
        int length = m2468interface.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i2 = 0;
                break;
            }
            i2 = m2468interface[i5];
            if (AbstractC8703e.m2467class(i2) == realm_value_t_type_get) {
                break;
            }
            i5++;
        }
        if (i2 == 0) {
            throw new IllegalStateException(("Unknown value type: " + realm_value_t_type_get).toString());
        }
        switch (AbstractC8703e.m2467class(i2)) {
            case 0:
                return null;
            case 1:
                return new C8648e(1, AbstractC3820e.ad.vip(Long.TYPE), Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar)));
            case 2:
                return new C8648e(2, AbstractC3820e.ad.vip(Boolean.TYPE), Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.ad, realm_value_tVar)));
            case 3:
                return new C8648e(3, AbstractC3820e.ad.vip(String.class), realmcJNI.realm_value_t_string_get(realm_value_tVar.ad, realm_value_tVar));
            case 4:
                realm_binary_t ad = realm_value_tVar.ad();
                return new C8648e(4, AbstractC3820e.ad.vip(byte[].class), realmcJNI.realm_binary_t_data_get(ad.ad, ad));
            case 5:
                return new C8648e(5, AbstractC3820e.ad.vip(InterfaceC6025e.class), new C2577e(AbstractC15871e.vip(realm_value_tVar)));
            case 6:
                return new C8648e(6, AbstractC3820e.ad.vip(Float.TYPE), Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.ad, realm_value_tVar)));
            case 7:
                return new C8648e(7, AbstractC3820e.ad.vip(Double.TYPE), Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.ad, realm_value_tVar)));
            case 8:
                realm_decimal128_t metrica = realm_value_tVar.metrica();
                long[] realm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(metrica.ad, metrica);
                long[] copyOf = Arrays.copyOf(realm_decimal128_t_w_get, realm_decimal128_t_w_get.length);
                C9131e c9131e = C12355e.Companion;
                long j2 = copyOf[1];
                long j3 = copyOf[0];
                c9131e.getClass();
                return new C8648e(8, AbstractC3820e.ad.vip(C12355e.class), C9131e.ad(j2, j3));
            case 9:
                BsonObjectId$Companion bsonObjectId$Companion = C2453e.Companion;
                byte[] bArr = new byte[12];
                realm_object_id_t license = realm_value_tVar.license();
                short[] realm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(license.ad, license);
                ArrayList arrayList = new ArrayList(realm_object_id_t_bytes_get.length);
                int length2 = realm_object_id_t_bytes_get.length;
                int i6 = 0;
                while (i4 < length2) {
                    bArr[i6] = (byte) realm_object_id_t_bytes_get[i4];
                    arrayList.add(Unit.INSTANCE);
                    i4++;
                    i6++;
                }
                bsonObjectId$Companion.getClass();
                return new C8648e(9, AbstractC3820e.ad.vip(C2453e.class), BsonObjectId$Companion.ad(bArr));
            case 10:
                if (!z) {
                    C18085e vip2 = interfaceC15348e.advert().vip(AbstractC15871e.ad(realm_value_tVar).ad);
                    if (vip2 == null || (interfaceC7227e = vip2.startapp) == null) {
                        throw new IllegalArgumentException("The object class is not present in the current schema - are you using an outdated schema version?");
                    }
                    return new C8648e(11, interfaceC7227e, (InterfaceC17544e) ((InterfaceC1340e) (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0 ? null : AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), interfaceC7227e, c17974e, interfaceC15348e))));
                }
                if (z2) {
                    vip = AbstractC3820e.ad.vip(DynamicMutableRealmObject.class);
                } else {
                    if (z2) {
                        throw new C14803e(10);
                    }
                    vip = AbstractC3820e.ad.vip(InterfaceC16120e.class);
                }
                return new C8648e(11, AbstractC3820e.ad.vip(InterfaceC16120e.class), (InterfaceC16120e) (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0 ? null : AbstractC15792e.Signature(AbstractC15871e.ad(realm_value_tVar), vip, c17974e, interfaceC15348e)));
            case 11:
                byte[] bArr2 = new byte[16];
                realm_uuid_t appmetrica = realm_value_tVar.appmetrica();
                short[] realm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(appmetrica.ad, appmetrica);
                ArrayList arrayList2 = new ArrayList(realm_uuid_t_bytes_get.length);
                int length3 = realm_uuid_t_bytes_get.length;
                int i7 = 0;
                while (i4 < length3) {
                    bArr2[i7] = (byte) realm_uuid_t_bytes_get[i4];
                    arrayList2.add(Unit.INSTANCE);
                    i4++;
                    i7++;
                }
                return new C8648e(10, AbstractC3820e.ad.vip(InterfaceC17159e.class), new C7588e(bArr2));
            case 12:
                long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                int i8 = AbstractC6026e.ad;
                LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_list_get_list(ptr$cinterop_release2, j), false, 2, null);
                return new C8648e(12, AbstractC3820e.ad.vip(InterfaceC5045e.class), new C9889e(null, longPointerWrapper2, new C6613e(c17974e, interfaceC15348e, longPointerWrapper2, z, z2)));
            case 13:
                long ptr$cinterop_release3 = longPointerWrapper.getPtr$cinterop_release();
                int i9 = AbstractC6026e.ad;
                LongPointerWrapper longPointerWrapper3 = new LongPointerWrapper(realmcJNI.realm_list_get_dictionary(ptr$cinterop_release3, j), false, 2, null);
                return new C8648e(13, AbstractC3820e.ad.vip(InterfaceC5045e.class), new AbstractC8807e(null, longPointerWrapper3, AbstractC6022e.yandex(c17974e, interfaceC15348e, longPointerWrapper3, z, z2)));
            default:
                throw new IllegalArgumentException("Unsupported type: ".concat(AbstractC8647e.m2456extends(i2)));
        }
    }

    public C0177e applovin() {
        InterfaceC4586e startapp = ((InterfaceC8246e) this.f13645e).startapp();
        C0177e c0177e = startapp instanceof C0177e ? (C0177e) startapp : null;
        if (c0177e != null) {
            return c0177e;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    @Override // defpackage.InterfaceC17128e
    public byte[] billing(int i, byte[] bArr) {
        int i2;
        InterfaceC2227e interfaceC2227e = (InterfaceC2227e) this.f13643e;
        byte[] bArr2 = (byte[]) this.f13640e;
        if (this.f13641e) {
            throw new IllegalStateException("not set for unwrapping");
        }
        if (i < 16) {
            throw new Exception("unwrap data too short");
        }
        int i3 = i / 8;
        if (i3 * 8 != i) {
            throw new Exception("unwrap data must be a multiple of 8 bytes");
        }
        int i4 = 1;
        interfaceC2227e.init(!this.f13642e, (C14915e) this.f13645e);
        byte[] bArr3 = new byte[i - bArr2.length];
        byte[] bArr4 = new byte[bArr2.length];
        int i5 = 8;
        byte[] bArr5 = new byte[bArr2.length + 8];
        int i6 = i3 - 1;
        if (i6 == 1) {
            interfaceC2227e.tapsense(0, 0, bArr, bArr5);
            System.arraycopy(bArr5, 0, bArr4, 0, bArr2.length);
            System.arraycopy(bArr5, bArr2.length, bArr3, 0, 8);
        } else {
            System.arraycopy(bArr, 0, bArr4, 0, bArr2.length);
            System.arraycopy(bArr, bArr2.length, bArr3, 0, i - bArr2.length);
            int i7 = 5;
            while (i7 >= 0) {
                int i8 = i6;
                while (i8 >= i4) {
                    System.arraycopy(bArr4, 0, bArr5, 0, bArr2.length);
                    int i9 = (i8 - 1) * i5;
                    System.arraycopy(bArr3, i9, bArr5, bArr2.length, i5);
                    int i10 = (i6 * i7) + i8;
                    int i11 = i4;
                    while (true) {
                        i2 = i4;
                        if (i10 != 0) {
                            int length = bArr2.length - i11;
                            bArr5[length] = (byte) (bArr5[length] ^ ((byte) i10));
                            i10 >>>= 8;
                            i11++;
                            i4 = i2;
                        }
                    }
                    interfaceC2227e.tapsense(0, 0, bArr5, bArr5);
                    System.arraycopy(bArr5, 0, bArr4, 0, 8);
                    System.arraycopy(bArr5, 8, bArr3, i9, 8);
                    i8--;
                    i4 = i2;
                    i5 = 8;
                }
                i7--;
                i5 = 8;
            }
        }
        if (i6 != i4) {
            if (!AbstractC12442e.loadAd(bArr4, bArr2)) {
                throw new Exception("checksum failed");
            }
        } else if (!AbstractC12442e.loadAd(bArr4, bArr2)) {
            System.arraycopy(bArr, 0, bArr4, 0, bArr2.length);
            System.arraycopy(bArr, bArr2.length, bArr3, 0, i - bArr2.length);
            for (int i12 = 5; i12 >= 0; i12--) {
                System.arraycopy(bArr4, 0, bArr5, 0, bArr2.length);
                System.arraycopy(bArr3, 0, bArr5, bArr2.length, 8);
                int i13 = (i6 * i12) + 1;
                int i14 = 1;
                while (i13 != 0) {
                    int length2 = bArr2.length - i14;
                    bArr5[length2] = (byte) (((byte) i13) ^ bArr5[length2]);
                    i13 >>>= 8;
                    i14++;
                }
                interfaceC2227e.tapsense(0, 0, bArr5, bArr5);
                System.arraycopy(bArr5, 0, bArr4, 0, 8);
                System.arraycopy(bArr5, 8, bArr3, 0, 8);
            }
            if (!AbstractC12442e.loadAd(bArr4, bArr2)) {
                throw new Exception("checksum failed");
            }
        }
        return bArr3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, eؕٛؓ] */
    /* renamed from: break, reason: not valid java name */
    public ArrayList m2234break(InterfaceC9905e interfaceC9905e) {
        C11980e c11980e = (C11980e) this.f13640e;
        C7719e c7719e = new C7719e(interfaceC9905e, C7985e.vip(((C17241e) c11980e.f23950e).admob, (C11243e) c11980e.f23951e.getValue(), ((AbstractC1186e) interfaceC9905e).getAnnotations()), null);
        C17877e c17877e = new C17877e(3, this);
        ArrayList arrayList = new ArrayList(1);
        mopub(c7719e, arrayList, c17877e);
        return arrayList;
    }

    @Override // defpackage.InterfaceC12556e
    public boolean contains(Object obj) {
        return indexOf((InterfaceC5045e) obj) != -1;
    }

    /* renamed from: extends, reason: not valid java name */
    public void m2235extends(boolean z, boolean z2) {
        C2399e c2399e = (C2399e) this.f13640e;
        if (z && z2) {
            c2399e.license(new RunnableC6715e(1, this, z, z2));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        C2399e c2399e2 = (C2399e) this.f13645e;
        c2399e2.ad.postDelayed(new RunnableC11247e(this, atomicBoolean, 23), 1000L);
        c2399e.license(new RunnableC4213e(this, atomicBoolean, z, z2, 1));
    }

    @Override // defpackage.InterfaceC12556e
    public Object firebase(final int i, Object obj, final int i2, final LinkedHashMap linkedHashMap) {
        InterfaceC5045e interfaceC5045e = get(i);
        C15816e c15816e = new C15816e(15);
        C15449e c15449e = new C15449e(this, i, 1);
        C2633e c2633e = new C2633e(i2, i, 1, this, linkedHashMap, c15816e);
        final int i3 = 0;
        Function1 function1 = new Function1(this) { // from class: eِؗۡ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6613e f23189e;

            {
                this.f23189e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i4 = i3;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                int i5 = i2;
                int i6 = i;
                C6613e c6613e = this.f23189e;
                InterfaceC5045e interfaceC5045e2 = (InterfaceC5045e) obj2;
                switch (i4) {
                    case 0:
                        long ptr$cinterop_release = ((LongPointerWrapper) c6613e.f13645e).getPtr$cinterop_release();
                        int i7 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_list_set_list(ptr$cinterop_release, i6), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        AbstractC5087e.yandex(new C6613e((C17974e) c6613e.f13643e, (InterfaceC15348e) c6613e.f13640e, longPointerWrapper, c6613e.f13642e, c6613e.f13641e), 0, (InterfaceC17101e) ((C8648e) interfaceC5045e2).advert(12), i5, linkedHashMap2);
                        return Unit.INSTANCE;
                    default:
                        long ptr$cinterop_release2 = ((LongPointerWrapper) c6613e.f13645e).getPtr$cinterop_release();
                        int i8 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_list_set_dictionary(ptr$cinterop_release2, i6), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC5087e.pro(AbstractC6022e.yandex((C17974e) c6613e.f13643e, (InterfaceC15348e) c6613e.f13640e, longPointerWrapper2, c6613e.f13642e, c6613e.f13641e), (InterfaceC6128e) ((C8648e) interfaceC5045e2).advert(13), i5, linkedHashMap2);
                        return Unit.INSTANCE;
                }
            }
        };
        final int i4 = 1;
        AbstractC6503e.vip(c15816e, (InterfaceC5045e) obj, c15449e, c2633e, function1, new Function1(this) { // from class: eِؗۡ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6613e f23189e;

            {
                this.f23189e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i42 = i4;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                int i5 = i2;
                int i6 = i;
                C6613e c6613e = this.f23189e;
                InterfaceC5045e interfaceC5045e2 = (InterfaceC5045e) obj2;
                switch (i42) {
                    case 0:
                        long ptr$cinterop_release = ((LongPointerWrapper) c6613e.f13645e).getPtr$cinterop_release();
                        int i7 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_list_set_list(ptr$cinterop_release, i6), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        AbstractC5087e.yandex(new C6613e((C17974e) c6613e.f13643e, (InterfaceC15348e) c6613e.f13640e, longPointerWrapper, c6613e.f13642e, c6613e.f13641e), 0, (InterfaceC17101e) ((C8648e) interfaceC5045e2).advert(12), i5, linkedHashMap2);
                        return Unit.INSTANCE;
                    default:
                        long ptr$cinterop_release2 = ((LongPointerWrapper) c6613e.f13645e).getPtr$cinterop_release();
                        int i8 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_list_set_dictionary(ptr$cinterop_release2, i6), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC5087e.pro(AbstractC6022e.yandex((C17974e) c6613e.f13643e, (InterfaceC15348e) c6613e.f13640e, longPointerWrapper2, c6613e.f13642e, c6613e.f13641e), (InterfaceC6128e) ((C8648e) interfaceC5045e2).advert(13), i5, linkedHashMap2);
                        return Unit.INSTANCE;
                }
            }
        });
        Unit unit = Unit.INSTANCE;
        c15816e.m4020interface();
        return interfaceC5045e;
    }

    @Override // defpackage.InterfaceC17128e
    public String getAlgorithmName() {
        switch (this.f13644e) {
            case 0:
                return ((InterfaceC2227e) this.f13643e).getAlgorithmName();
            default:
                return "XTEA";
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [eٍؚؒ, java.lang.Object] */
    /* renamed from: implements, reason: not valid java name */
    public C0909e m2236implements() {
        C4602e c4602e = (C4602e) this.f13643e;
        if (c4602e.f9917e) {
            throw new IllegalStateException("Check failed.");
        }
        c4602e.f9917e = true;
        c4602e.f9913e.startapp();
        synchronized (c4602e) {
            if (c4602e.f9919e == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (c4602e.f9918e || c4602e.f9922e) {
                throw new IllegalStateException("Check failed.");
            }
            if (c4602e.f9915e) {
                throw new IllegalStateException("Check failed.");
            }
            if (!c4602e.f9914e) {
                throw new IllegalStateException("Check failed.");
            }
            c4602e.f9914e = false;
            c4602e.f9918e = true;
            c4602e.f9922e = true;
            Unit unit = Unit.INSTANCE;
        }
        C0177e c0177e = (C0177e) ((InterfaceC8246e) this.f13645e).startapp();
        c0177e.appmetrica.setSoTimeout(0);
        c0177e.ad();
        ?? obj = new Object();
        obj.f3321e = this;
        InterfaceC8246e interfaceC8246e = (InterfaceC8246e) this.f13645e;
        obj.f3323e = new C8254e(this, interfaceC8246e.billing().subs(), -1L, true);
        obj.f3322e = new C4878e(this, interfaceC8246e.billing().adcel(), -1L, true);
        return obj;
    }

    @Override // defpackage.InterfaceC12556e
    public int indexOf(Object obj) {
        realm_value_t m4012break;
        InterfaceC5045e interfaceC5045e = (InterfaceC5045e) obj;
        C12575e c12575e = C12575e.f25237e;
        if ((interfaceC5045e != null ? ((C8648e) interfaceC5045e).ad : 0) == 11) {
            if (!C7290e.yandex(((C8648e) interfaceC5045e).startapp(AbstractC3820e.ad.vip(InterfaceC10518e.class)))) {
                return -1;
            }
        }
        C15816e c15816e = new C15816e(15);
        if (interfaceC5045e == null) {
            m4012break = c15816e.m4024try();
        } else {
            C8648e c8648e = (C8648e) interfaceC5045e;
            int i = c8648e.ad;
            switch (AbstractC8703e.m2467class(i)) {
                case 10:
                    InterfaceC14287e startapp = c8648e.startapp(AbstractC3820e.ad.vip(InterfaceC14287e.class));
                    if (startapp != null) {
                        C13655e f36702e = ((InterfaceC10518e) startapp).getF36702e();
                        r0 = f36702e != null ? f36702e : null;
                        if (r0 == null) {
                            throw new IllegalArgumentException("Cannot lookup unmanaged objects in realm");
                        }
                    }
                    m4012break = c15816e.m4012break(r0);
                    break;
                case 11:
                case 12:
                    throw new IllegalArgumentException("Cannot pass unmanaged collections as input argument");
                default:
                    switch (AbstractC8703e.m2467class(i)) {
                        case 0:
                            m4012break = c15816e.m4025while(Long.valueOf(c8648e.purchase()));
                            break;
                        case 1:
                            m4012break = c15816e.adcel(Boolean.valueOf(c8648e.ad()));
                            break;
                        case 2:
                            m4012break = c15816e.m4015default(c8648e.mopub());
                            break;
                        case 3:
                            m4012break = c15816e.advert(c8648e.vip());
                            break;
                        case 4:
                            m4012break = c15816e.m4019implements((C2577e) c8648e.yandex());
                            break;
                        case 5:
                            m4012break = c15816e.firebase(Float.valueOf(c8648e.appmetrica()));
                            break;
                        case 6:
                            m4012break = c15816e.applovin(Double.valueOf(c8648e.license()));
                            break;
                        case 7:
                            m4012break = c15816e.inmobi(c8648e.metrica());
                            break;
                        case 8:
                            m4012break = c12575e.applovin(c8648e.billing().yandex());
                            break;
                        case 9:
                            m4012break = c12575e.m3368interface(((C7588e) c8648e.adcel()).ad);
                            break;
                        default:
                            throw new UnsupportedOperationException("If you want to convert a 'RealmAny' instance containing an object to a 'RealmValue' use 'realmAnyToRealmValue' (when working with 'RealmQuery') or 'realmAnyToRealmValueWithObjectImport' (when using an accessor).");
                    }
            }
        }
        realm_value_t realm_value_tVar = m4012break;
        long[] jArr = new long[1];
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f13645e).getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_list_find(ptr$cinterop_release, realm_value_tVar.ad, realm_value_tVar, jArr, zArr);
        int i3 = (int) (zArr[0] ? jArr[0] : -1L);
        c15816e.m4020interface();
        return i3;
    }

    @Override // defpackage.InterfaceC17128e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        switch (this.f13644e) {
            case 0:
                byte[] bArr = (byte[]) this.f13640e;
                this.f13641e = z;
                if (interfaceC3894e instanceof C12219e) {
                    interfaceC3894e = ((C12219e) interfaceC3894e).f24537e;
                }
                if (interfaceC3894e instanceof C14915e) {
                    this.f13645e = (C14915e) interfaceC3894e;
                    System.arraycopy(f13639e, 0, bArr, 0, 8);
                    return;
                } else {
                    if (interfaceC3894e instanceof C11494e) {
                        C11494e c11494e = (C11494e) interfaceC3894e;
                        byte[] bArr2 = c11494e.f23095e;
                        if (bArr2.length != 8) {
                            throw new IllegalArgumentException("IV not equal to 8");
                        }
                        this.f13645e = (C14915e) c11494e.f23094e;
                        System.arraycopy(bArr2, 0, bArr, 0, 8);
                        return;
                    }
                    return;
                }
            default:
                if (!(interfaceC3894e instanceof C14915e)) {
                    throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to TEA init - ", interfaceC3894e));
                }
                this.f13641e = z;
                this.f13642e = true;
                byte[] bArr3 = ((C14915e) interfaceC3894e).f29591e;
                int[] iArr = (int[]) this.f13643e;
                if (bArr3.length != 16) {
                    throw new IllegalArgumentException("Key size must be 128 bits.");
                }
                int i = 0;
                int i2 = 0;
                while (i < 4) {
                    iArr[i] = adcel(i2, bArr3);
                    i++;
                    i2 += 4;
                }
                int i3 = 0;
                for (int i4 = 0; i4 < 32; i4++) {
                    ((int[]) this.f13640e)[i4] = iArr[i3 & 3] + i3;
                    i3 -= 1640531527;
                    ((int[]) this.f13645e)[i4] = iArr[(i3 >>> 11) & 3] + i3;
                }
                if (interfaceC3894e instanceof EnumC0300e) {
                    throw new IllegalArgumentException("params should not be CryptoServicePurpose");
                }
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                return;
        }
    }

    @Override // defpackage.InterfaceC12556e
    public boolean inmobi(int i, Collection collection, int i2, Map map) {
        return AbstractC5087e.yandex(this, i, collection, i2, map);
    }

    /* renamed from: interface, reason: not valid java name */
    public int[] m2237interface() {
        synchronized (this) {
            try {
                if (this.f13642e && !this.f13641e) {
                    int length = ((long[]) this.f13643e).length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i >= length) {
                            this.f13641e = true;
                            this.f13642e = false;
                            return (int[]) this.f13645e;
                        }
                        boolean z = ((long[]) this.f13643e)[i] > 0;
                        boolean[] zArr = (boolean[]) this.f13640e;
                        if (z != zArr[i]) {
                            int[] iArr = (int[]) this.f13645e;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            ((int[]) this.f13645e)[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    @Override // defpackage.InterfaceC2227e
    public int isPro() {
        return 8;
    }

    @Override // defpackage.InterfaceC12556e
    public void isVip(final int i, Object obj, final int i2, final Map map) {
        C15816e c15816e = new C15816e(15);
        C15449e c15449e = new C15449e(this, i, 0);
        C2633e c2633e = new C2633e(i2, i, 0, this, map, c15816e);
        final int i3 = 0;
        Function1 function1 = new Function1(this) { // from class: eًّۚ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6613e f25490e;

            {
                this.f25490e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i4 = i3;
                Map map2 = map;
                int i5 = i2;
                int i6 = i;
                C6613e c6613e = this.f25490e;
                InterfaceC5045e interfaceC5045e = (InterfaceC5045e) obj2;
                switch (i4) {
                    case 0:
                        long ptr$cinterop_release = ((LongPointerWrapper) c6613e.f13645e).getPtr$cinterop_release();
                        int i7 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_list_insert_list(ptr$cinterop_release, i6), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        return Boolean.valueOf(AbstractC5087e.yandex(new C6613e((C17974e) c6613e.f13643e, (InterfaceC15348e) c6613e.f13640e, longPointerWrapper, c6613e.f13642e, c6613e.f13641e), 0, (InterfaceC17101e) ((C8648e) interfaceC5045e).advert(12), i5, map2));
                    default:
                        long ptr$cinterop_release2 = ((LongPointerWrapper) c6613e.f13645e).getPtr$cinterop_release();
                        int i8 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_list_insert_dictionary(ptr$cinterop_release2, i6), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC5087e.pro(AbstractC6022e.yandex((C17974e) c6613e.f13643e, (InterfaceC15348e) c6613e.f13640e, longPointerWrapper2, c6613e.f13642e, c6613e.f13641e), (InterfaceC6128e) ((C8648e) interfaceC5045e).advert(13), i5, map2);
                        return Unit.INSTANCE;
                }
            }
        };
        final int i4 = 1;
        AbstractC6503e.vip(c15816e, (InterfaceC5045e) obj, c15449e, c2633e, function1, new Function1(this) { // from class: eًّۚ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6613e f25490e;

            {
                this.f25490e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i42 = i4;
                Map map2 = map;
                int i5 = i2;
                int i6 = i;
                C6613e c6613e = this.f25490e;
                InterfaceC5045e interfaceC5045e = (InterfaceC5045e) obj2;
                switch (i42) {
                    case 0:
                        long ptr$cinterop_release = ((LongPointerWrapper) c6613e.f13645e).getPtr$cinterop_release();
                        int i7 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_list_insert_list(ptr$cinterop_release, i6), false, 2, null);
                        realmcJNI.realm_list_clear(longPointerWrapper.getPtr$cinterop_release());
                        return Boolean.valueOf(AbstractC5087e.yandex(new C6613e((C17974e) c6613e.f13643e, (InterfaceC15348e) c6613e.f13640e, longPointerWrapper, c6613e.f13642e, c6613e.f13641e), 0, (InterfaceC17101e) ((C8648e) interfaceC5045e).advert(12), i5, map2));
                    default:
                        long ptr$cinterop_release2 = ((LongPointerWrapper) c6613e.f13645e).getPtr$cinterop_release();
                        int i8 = AbstractC6026e.ad;
                        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_list_insert_dictionary(ptr$cinterop_release2, i6), false, 2, null);
                        realmcJNI.realm_dictionary_clear(longPointerWrapper2.getPtr$cinterop_release());
                        AbstractC5087e.pro(AbstractC6022e.yandex((C17974e) c6613e.f13643e, (InterfaceC15348e) c6613e.f13640e, longPointerWrapper2, c6613e.f13642e, c6613e.f13641e), (InterfaceC6128e) ((C8648e) interfaceC5045e).advert(13), i5, map2);
                        return Unit.INSTANCE;
                }
            }
        });
        c15816e.m4020interface();
    }

    @Override // defpackage.InterfaceC17128e
    public byte[] license(int i, byte[] bArr) {
        InterfaceC2227e interfaceC2227e = (InterfaceC2227e) this.f13643e;
        byte[] bArr2 = (byte[]) this.f13640e;
        if (!this.f13641e) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i < 8) {
            throw new RuntimeException("wrap data must be at least 8 bytes");
        }
        int i2 = i / 8;
        if (i2 * 8 != i) {
            throw new RuntimeException("wrap data must be a multiple of 8 bytes");
        }
        interfaceC2227e.init(this.f13642e, (C14915e) this.f13645e);
        byte[] bArr3 = new byte[bArr2.length + i];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, bArr2.length, i);
        if (i2 == 1) {
            interfaceC2227e.tapsense(0, 0, bArr3, bArr3);
            return bArr3;
        }
        byte[] bArr4 = new byte[bArr2.length + 8];
        for (int i3 = 0; i3 != 6; i3++) {
            for (int i4 = 1; i4 <= i2; i4++) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr2.length);
                int i5 = i4 * 8;
                System.arraycopy(bArr3, i5, bArr4, bArr2.length, 8);
                interfaceC2227e.tapsense(0, 0, bArr4, bArr4);
                int i6 = (i2 * i3) + i4;
                int i7 = 1;
                while (i6 != 0) {
                    int length = bArr2.length - i7;
                    bArr4[length] = (byte) (bArr4[length] ^ ((byte) i6));
                    i6 >>>= 8;
                    i7++;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr3, i5, 8);
            }
        }
        return bArr3;
    }

    @Override // defpackage.InterfaceC12556e
    public InterfaceC12556e metrica(InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        return new C6613e((C17974e) this.f13643e, interfaceC15348e, longPointerWrapper, this.f13642e, this.f13641e);
    }

    public C16192e pro(InterfaceC4752e interfaceC4752e) {
        List list;
        EnumC7701e enumC7701e;
        if (!(interfaceC4752e instanceof C7232e)) {
            return null;
        }
        List upperBounds = ((InterfaceC16046e) interfaceC4752e).getUpperBounds();
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!AbstractC0083e.premium((InterfaceC9905e) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : upperBounds) {
                    if (subs((InterfaceC9905e) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                InterfaceC3477e appmetrica = AbstractC18039e.appmetrica(3, new C12056e(upperBounds, this, 0));
                boolean isEmpty = arrayList.isEmpty();
                EnumC7701e enumC7701e2 = EnumC7701e.f15629e;
                if (!isEmpty) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            list = upperBounds;
                        }
                    }
                    return new C16192e(enumC7701e2, false);
                }
                if (((List) appmetrica.getValue()).isEmpty()) {
                    return null;
                }
                List list2 = (List) appmetrica.getValue();
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        list = (List) appmetrica.getValue();
                    }
                }
                return new C16192e(enumC7701e2, true);
                if (list == null || !list.isEmpty()) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        if (!AbstractC0083e.m238goto((InterfaceC9905e) it4.next())) {
                            enumC7701e = EnumC7701e.f15626e;
                            break;
                        }
                    }
                }
                enumC7701e = EnumC7701e.f15627e;
                return new C16192e(enumC7701e, list != upperBounds);
            }
        }
        return null;
    }

    /* renamed from: protected, reason: not valid java name */
    public void m2238protected(boolean z) {
        switch (this.f13644e) {
            case 5:
                if (this.f13641e == z) {
                    return;
                }
                this.f13641e = z;
                if (this.f13642e) {
                    m2239this(true, z);
                    return;
                }
                return;
            default:
                if (this.f13641e == z) {
                    return;
                }
                this.f13641e = z;
                if (this.f13642e) {
                    m2235extends(true, z);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC12556e
    public boolean remove(Object obj) {
        return AbstractC5087e.tapsense(this, (InterfaceC5045e) obj);
    }

    @Override // defpackage.InterfaceC2227e
    public void reset() {
    }

    @Override // defpackage.InterfaceC2227e
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int[] iArr = (int[]) this.f13645e;
        int[] iArr2 = (int[]) this.f13640e;
        if (!this.f13642e) {
            throw new IllegalStateException("XTEA not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        if (this.f13641e) {
            int adcel = adcel(i, bArr);
            int adcel2 = adcel(i + 4, bArr);
            for (int i3 = 0; i3 < 32; i3++) {
                adcel += (((adcel2 << 4) ^ (adcel2 >>> 5)) + adcel2) ^ iArr2[i3];
                adcel2 += (((adcel << 4) ^ (adcel >>> 5)) + adcel) ^ iArr[i3];
            }
            m2232default(adcel, i2, bArr2);
            m2232default(adcel2, i2 + 4, bArr2);
            return 8;
        }
        int adcel3 = adcel(i, bArr);
        int adcel4 = adcel(i + 4, bArr);
        for (int i4 = 31; i4 >= 0; i4--) {
            adcel4 -= (((adcel3 << 4) ^ (adcel3 >>> 5)) + adcel3) ^ iArr[i4];
            adcel3 -= (((adcel4 << 4) ^ (adcel4 >>> 5)) + adcel4) ^ iArr2[i4];
        }
        m2232default(adcel3, i2, bArr2);
        m2232default(adcel4, i2 + 4, bArr2);
        return 8;
    }

    /* renamed from: this, reason: not valid java name */
    public void m2239this(boolean z, boolean z2) {
        C2399e c2399e = (C2399e) this.f13640e;
        if (z && z2) {
            c2399e.license(new RunnableC6715e(0, this, z, z2));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        C2399e c2399e2 = (C2399e) this.f13645e;
        c2399e2.ad.postDelayed(new RunnableC11247e(this, atomicBoolean, 21), 1000L);
        c2399e.license(new RunnableC4213e(this, atomicBoolean, z, z2, 0));
    }

    /* renamed from: try, reason: not valid java name */
    public void m2240try(boolean z) {
        switch (this.f13644e) {
            case 5:
                if (this.f13642e == z) {
                    return;
                }
                this.f13642e = z;
                m2239this(z, this.f13641e);
                return;
            default:
                if (this.f13642e == z) {
                    return;
                }
                this.f13642e = z;
                m2235extends(z, this.f13641e);
                return;
        }
    }

    @Override // defpackage.InterfaceC12556e
    public NativePointer vip() {
        return (LongPointerWrapper) this.f13645e;
    }

    /* renamed from: while, reason: not valid java name */
    public C7677e m2241while(boolean z) {
        try {
            C7677e appmetrica = ((InterfaceC8246e) this.f13645e).appmetrica(z);
            if (appmetrica == null) {
                return appmetrica;
            }
            appmetrica.amazon = this;
            return appmetrica;
        } catch (IOException e) {
            m2233abstract(e);
            throw e;
        }
    }

    @Override // defpackage.InterfaceC2750e
    public InterfaceC15348e yandex() {
        return (InterfaceC15348e) this.f13640e;
    }
}
