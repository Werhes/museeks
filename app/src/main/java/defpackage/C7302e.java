package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import android.view.WindowInsetsAnimation;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٜۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7302e implements InterfaceC17847e, InterfaceC1835e, InterfaceC7998e, InterfaceC0987e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f14915e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f14916e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14917e;

    public C7302e() {
        this.f14917e = 4;
        this.f14916e = new HashMap();
        this.f14915e = new C12303e(6);
        C12303e c12303e = new C12303e(0);
        EnumC16521e enumC16521e = EnumC16521e.BITWISE_AND;
        ArrayList arrayList = c12303e.ad;
        arrayList.add(enumC16521e);
        arrayList.add(EnumC16521e.BITWISE_LEFT_SHIFT);
        arrayList.add(EnumC16521e.BITWISE_NOT);
        arrayList.add(EnumC16521e.BITWISE_OR);
        arrayList.add(EnumC16521e.BITWISE_RIGHT_SHIFT);
        arrayList.add(EnumC16521e.BITWISE_UNSIGNED_RIGHT_SHIFT);
        arrayList.add(EnumC16521e.BITWISE_XOR);
        appmetrica(c12303e);
        C12303e c12303e2 = new C12303e(1);
        EnumC16521e enumC16521e2 = EnumC16521e.EQUALS;
        ArrayList arrayList2 = c12303e2.ad;
        arrayList2.add(enumC16521e2);
        arrayList2.add(EnumC16521e.GREATER_THAN);
        arrayList2.add(EnumC16521e.GREATER_THAN_EQUALS);
        arrayList2.add(EnumC16521e.IDENTITY_EQUALS);
        arrayList2.add(EnumC16521e.IDENTITY_NOT_EQUALS);
        arrayList2.add(EnumC16521e.LESS_THAN);
        arrayList2.add(EnumC16521e.LESS_THAN_EQUALS);
        arrayList2.add(EnumC16521e.NOT_EQUALS);
        appmetrica(c12303e2);
        C12303e c12303e3 = new C12303e(2);
        EnumC16521e enumC16521e3 = EnumC16521e.APPLY;
        ArrayList arrayList3 = c12303e3.ad;
        arrayList3.add(enumC16521e3);
        arrayList3.add(EnumC16521e.BLOCK);
        arrayList3.add(EnumC16521e.BREAK);
        arrayList3.add(EnumC16521e.CASE);
        arrayList3.add(EnumC16521e.DEFAULT);
        arrayList3.add(EnumC16521e.CONTINUE);
        arrayList3.add(EnumC16521e.DEFINE_FUNCTION);
        arrayList3.add(EnumC16521e.FN);
        arrayList3.add(EnumC16521e.IF);
        arrayList3.add(EnumC16521e.QUOTE);
        arrayList3.add(EnumC16521e.RETURN);
        arrayList3.add(EnumC16521e.SWITCH);
        arrayList3.add(EnumC16521e.TERNARY);
        appmetrica(c12303e3);
        C12303e c12303e4 = new C12303e(3);
        EnumC16521e enumC16521e4 = EnumC16521e.AND;
        ArrayList arrayList4 = c12303e4.ad;
        arrayList4.add(enumC16521e4);
        arrayList4.add(EnumC16521e.NOT);
        arrayList4.add(EnumC16521e.OR);
        appmetrica(c12303e4);
        C12303e c12303e5 = new C12303e(4);
        EnumC16521e enumC16521e5 = EnumC16521e.FOR_IN;
        ArrayList arrayList5 = c12303e5.ad;
        arrayList5.add(enumC16521e5);
        arrayList5.add(EnumC16521e.FOR_IN_CONST);
        arrayList5.add(EnumC16521e.FOR_IN_LET);
        arrayList5.add(EnumC16521e.FOR_LET);
        arrayList5.add(EnumC16521e.FOR_OF);
        arrayList5.add(EnumC16521e.FOR_OF_CONST);
        arrayList5.add(EnumC16521e.FOR_OF_LET);
        arrayList5.add(EnumC16521e.WHILE);
        appmetrica(c12303e5);
        C12303e c12303e6 = new C12303e(5);
        EnumC16521e enumC16521e6 = EnumC16521e.ADD;
        ArrayList arrayList6 = c12303e6.ad;
        arrayList6.add(enumC16521e6);
        arrayList6.add(EnumC16521e.DIVIDE);
        arrayList6.add(EnumC16521e.MODULUS);
        arrayList6.add(EnumC16521e.MULTIPLY);
        arrayList6.add(EnumC16521e.NEGATE);
        arrayList6.add(EnumC16521e.POST_DECREMENT);
        arrayList6.add(EnumC16521e.POST_INCREMENT);
        arrayList6.add(EnumC16521e.PRE_DECREMENT);
        arrayList6.add(EnumC16521e.PRE_INCREMENT);
        arrayList6.add(EnumC16521e.SUBTRACT);
        appmetrica(c12303e6);
        C12303e c12303e7 = new C12303e(7);
        EnumC16521e enumC16521e7 = EnumC16521e.ASSIGN;
        ArrayList arrayList7 = c12303e7.ad;
        arrayList7.add(enumC16521e7);
        arrayList7.add(EnumC16521e.CONST);
        arrayList7.add(EnumC16521e.CREATE_ARRAY);
        arrayList7.add(EnumC16521e.CREATE_OBJECT);
        arrayList7.add(EnumC16521e.EXPRESSION_LIST);
        arrayList7.add(EnumC16521e.GET);
        arrayList7.add(EnumC16521e.GET_INDEX);
        arrayList7.add(EnumC16521e.GET_PROPERTY);
        arrayList7.add(EnumC16521e.NULL);
        arrayList7.add(EnumC16521e.SET_PROPERTY);
        arrayList7.add(EnumC16521e.TYPEOF);
        arrayList7.add(EnumC16521e.UNDEFINED);
        arrayList7.add(EnumC16521e.VAR);
        appmetrica(c12303e7);
    }

    public /* synthetic */ C7302e(int i, Object obj) {
        this.f14917e = i;
        this.f14916e = obj;
    }

    public C7302e(WindowInsetsAnimation.Bounds bounds) {
        this.f14917e = 1;
        this.f14916e = C3109e.billing(bounds);
        this.f14915e = C3109e.purchase(bounds);
    }

    public /* synthetic */ C7302e(C8130e c8130e, String str, C2180e c2180e) {
        this.f14917e = 6;
        this.f14916e = str;
        this.f14915e = c2180e;
    }

    public C7302e(C8383e c8383e, int i) {
        this.f14917e = 8;
        this.f14915e = c8383e;
        this.f14916e = new AtomicReferenceArray(i);
    }

    public /* synthetic */ C7302e(Object obj, Object obj2, int i) {
        this.f14917e = i;
        this.f14916e = obj;
        this.f14915e = obj2;
    }

    public /* synthetic */ C7302e(Object obj, Object obj2, boolean z, int i) {
        this.f14917e = i;
        this.f14915e = obj;
        this.f14916e = obj2;
    }

    public static void metrica(C7302e c7302e, boolean z, boolean z2) {
        synchronized (c7302e) {
            boolean z3 = false;
            if (z) {
                if (((PowerManager.WakeLock) c7302e.f14915e) == null) {
                    if (((Context) c7302e.f14916e).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        AbstractC2803e.smaato("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) c7302e.f14916e).getSystemService("power");
                    if (powerManager == null) {
                        AbstractC2803e.smaato("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        c7302e.f14915e = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) c7302e.f14915e;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [eؚٖٗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eؚٖٗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [eؚٖٗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [eٍٗؒ, java.lang.Object] */
    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        Pair create;
        switch (this.f14917e) {
            case 3:
                BinderC6030e binderC6030e = new BinderC6030e((C4480e) this.f14916e, (C8988e) obj2, 0);
                C0563e c0563e = (C0563e) ((C2324e) obj).loadAd();
                C9705e c9705e = (C9705e) this.f14915e;
                Parcel adcel = c0563e.adcel();
                int i = AbstractC9126e.ad;
                adcel.writeStrongBinder(binderC6030e);
                AbstractC9126e.vip(adcel, c9705e);
                c0563e.remoteconfig(adcel, 1);
                return;
            default:
                C7971e c7971e = (C7971e) obj;
                C4627e c4627e = new C4627e((C8988e) obj2);
                String[] strArr = {(String) this.f14916e};
                C2180e c2180e = (C2180e) this.f14915e;
                c7971e.getClass();
                try {
                    int i2 = c2180e.vip;
                    if (i2 == 1) {
                        ?? obj3 = new Object();
                        obj3.f14732e = -1L;
                        obj3.f14729e = 0L;
                        obj3.f14723e = false;
                        obj3.f14721e = 0L;
                        obj3.f14730e = c2180e.ad;
                        obj3.f14725e = i2;
                        byte[] bArr = c2180e.metrica;
                        if (bArr == null || bArr.length <= 32768) {
                            obj3.f14722e = bArr;
                        } else {
                            ?? obj4 = new Object();
                            obj4.f18859e = bArr;
                            obj3.f14727e = obj4;
                            obj3.f14722e = Arrays.copyOf(bArr, 32768);
                        }
                        create = Pair.create(obj3, C3368e.f7570e);
                    } else if (i2 == 2) {
                        C16389e c16389e = c2180e.license;
                        if (c16389e == null) {
                            throw new NullPointerException("File cannot be null for Payload.Type.FILE");
                        }
                        File file = (File) c16389e.f32194e;
                        String absolutePath = file == null ? null : file.getAbsolutePath();
                        Uri uri = (Uri) c16389e.f32195e;
                        ?? obj5 = new Object();
                        obj5.f14730e = c2180e.ad;
                        obj5.f14725e = c2180e.vip;
                        obj5.f14728e = (ParcelFileDescriptor) c16389e.f32193e;
                        obj5.f14726e = uri;
                        obj5.f14719e = absolutePath;
                        obj5.f14732e = c16389e.f32196e;
                        obj5.f14729e = 0L;
                        obj5.f14723e = false;
                        obj5.f14721e = c2180e.purchase;
                        obj5.f14720e = c2180e.billing;
                        obj5.f14724e = c2180e.yandex;
                        create = Pair.create(obj5, C3368e.f7570e);
                    } else {
                        if (i2 != 3) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(String.format("Outgoing Payload %d has unknown type %d", Long.valueOf(c2180e.ad), Integer.valueOf(c2180e.vip)));
                            Log.wtf("NearbyConnections", "Unknown payload type!", illegalArgumentException);
                            throw illegalArgumentException;
                        }
                        try {
                            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                            ParcelFileDescriptor[] createPipe2 = ParcelFileDescriptor.createPipe();
                            ?? obj6 = new Object();
                            obj6.f14732e = -1L;
                            obj6.f14729e = 0L;
                            obj6.f14723e = false;
                            obj6.f14721e = 0L;
                            obj6.f14730e = c2180e.ad;
                            obj6.f14725e = c2180e.vip;
                            obj6.f14728e = createPipe[0];
                            obj6.f14731e = createPipe2[0];
                            obj6.f14729e = 0L;
                            obj6.f14721e = c2180e.purchase;
                            Pair create2 = Pair.create(createPipe[1], createPipe2[1]);
                            create2.getClass();
                            create = Pair.create(obj6, new C2322e(create2));
                        } catch (IOException e) {
                            Log.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", Long.valueOf(c2180e.ad)), e);
                            throw e;
                        }
                    }
                    C11125e c11125e = (C11125e) c7971e.loadAd();
                    BinderC11050e binderC11050e = new BinderC11050e(c4627e);
                    C7210e c7210e = (C7210e) create.first;
                    Parcel m4156e = c11125e.m4156e();
                    int i3 = AbstractC0923e.ad;
                    m4156e.writeInt(1);
                    int applovin = AbstractC16852e.applovin(m4156e, 20293);
                    AbstractC16852e.smaato(m4156e, 1, binderC11050e);
                    AbstractC16852e.pro(m4156e, 2, strArr);
                    AbstractC16852e.subscription(m4156e, 3, c7210e, 0);
                    AbstractC16852e.isPro(m4156e, 4, 4);
                    m4156e.writeInt(0);
                    AbstractC16852e.isPro(m4156e, 5, 4);
                    m4156e.writeInt(0);
                    AbstractC16852e.ads(m4156e, applovin);
                    c11125e.m4153e(m4156e, 2008);
                    if (((AbstractC13582e) create.second).vip()) {
                        Object ad = ((AbstractC13582e) create.second).ad();
                        C5976e c5976e = c7971e.f16146native;
                        if (c5976e != null) {
                            C3168e c3168e = c2180e.appmetrica;
                            AbstractC9528e.startapp(c3168e);
                            if (((ParcelFileDescriptor.AutoCloseInputStream) c3168e.f7272e) == null) {
                                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) c3168e.f7271e;
                                AbstractC9528e.startapp(parcelFileDescriptor);
                                c3168e.f7272e = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                            }
                            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = (ParcelFileDescriptor.AutoCloseInputStream) c3168e.f7272e;
                            Pair pair = (Pair) ad;
                            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.first);
                            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.second);
                            C7210e c7210e2 = (C7210e) create.first;
                            long j = c2180e.ad;
                            synchronized (c5976e) {
                                C17519e c17519e = c5976e.vip;
                                Long valueOf = Long.valueOf(j);
                                c17519e.put(valueOf, autoCloseInputStream);
                                c5976e.license.put(valueOf, autoCloseOutputStream);
                                c5976e.appmetrica.put(valueOf, c7210e2);
                                c5976e.ad.execute(new RunnableC2360e(c5976e, autoCloseInputStream, autoCloseOutputStream, j, autoCloseOutputStream2));
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (IOException e2) {
                    Log.w("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", e2);
                    C7971e.crashlytics(8013);
                    c4627e.ad.vip(null);
                    return;
                }
        }
    }

    @Override // defpackage.InterfaceC7998e
    public Object ad(C11467e c11467e) {
        Uri uri = (Uri) c11467e.f23071e;
        AtomicLong atomicLong = AbstractC11645e.ad;
        int myPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long currentTimeMillis = System.currentTimeMillis();
        long andIncrement = AbstractC11645e.ad.getAndIncrement();
        int length = String.valueOf(myPid).length();
        int length2 = String.valueOf(id).length();
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(currentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(myPid);
        sb.append("-");
        sb.append(id);
        sb.append("-");
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(andIncrement);
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        InterfaceC1312e interfaceC1312e = (InterfaceC1312e) c11467e.f23072e;
        ArrayList m3208break = c11467e.m3208break(interfaceC1312e.license(build));
        C17659e[] c17659eArr = (C17659e[]) this.f14915e;
        if (c17659eArr != null) {
            c17659eArr[0].ad(m3208break);
        }
        try {
            OutputStream outputStream = (OutputStream) m3208break.get(0);
            try {
                ((AbstractC17836e) this.f14916e).vip(outputStream);
                C17659e[] c17659eArr2 = (C17659e[]) this.f14915e;
                if (c17659eArr2 != null) {
                    C17659e c17659e = c17659eArr2[0];
                    if (((C15387e) c17659e.f34612e) == null) {
                        throw new IOException("Cannot sync underlying stream");
                    }
                    ((OutputStream) c17659e.f34613e).flush();
                    ((C15387e) c17659e.f34612e).f30341e.getFD().sync();
                }
                outputStream.close();
                interfaceC1312e.purchase(build, uri);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                interfaceC1312e.appmetrica(build);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    public void appmetrica(C12303e c12303e) {
        Iterator it = c12303e.ad.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f14916e).put(Integer.valueOf(((EnumC16521e) it.next()).f32402e).toString(), c12303e);
        }
    }

    public AbstractC6124e billing(long j, int i, String str) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f14916e;
        AbstractC6124e abstractC6124e = (AbstractC6124e) atomicReferenceArray.get(i);
        if (abstractC6124e != null) {
            return abstractC6124e;
        }
        C4484e c4484e = new C4484e(str, (C2580e) ((C8383e) this.f14915e).f17149e, j);
        while (!atomicReferenceArray.compareAndSet(i, null, c4484e)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC6124e abstractC6124e2 = (AbstractC6124e) atomicReferenceArray.get(i);
                abstractC6124e2.getClass();
                return abstractC6124e2;
            }
        }
        return c4484e;
    }

    @Override // defpackage.InterfaceC0987e
    public ListenableFuture call() {
        InterfaceC4766e ad = AbstractC5076e.ad(AbstractC5076e.vip(), (InterfaceC4766e) this.f14916e);
        try {
            return ((InterfaceC0987e) this.f14915e).call();
        } finally {
        }
    }

    public AbstractC6124e license(String str, boolean z, int i) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f14916e;
        AbstractC6124e abstractC6124e = (AbstractC6124e) atomicReferenceArray.get(i);
        if (abstractC6124e != null) {
            return abstractC6124e;
        }
        C8085e ad = ((C8383e) this.f14915e).ad(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, ad)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC6124e abstractC6124e2 = (AbstractC6124e) atomicReferenceArray.get(i);
                abstractC6124e2.getClass();
                return abstractC6124e2;
            }
        }
        return ad;
    }

    public InterfaceC2268e purchase(C11467e c11467e, InterfaceC2268e interfaceC2268e) {
        AbstractC8677e.signatures(c11467e);
        if (!(interfaceC2268e instanceof C5094e)) {
            return interfaceC2268e;
        }
        C5094e c5094e = (C5094e) interfaceC2268e;
        ArrayList arrayList = c5094e.f10934e;
        String str = c5094e.f10935e;
        HashMap hashMap = (HashMap) this.f14916e;
        return (hashMap.containsKey(str) ? (C12303e) hashMap.get(str) : (C12303e) this.f14915e).ad(str, c11467e, arrayList);
    }

    public String toString() {
        switch (this.f14917e) {
            case 1:
                return "Bounds{lower=" + ((C7088e) this.f14916e) + " upper=" + ((C7088e) this.f14915e) + "}";
            case 10:
                InterfaceC0987e interfaceC0987e = (InterfaceC0987e) this.f14915e;
                StringBuilder sb = new StringBuilder(interfaceC0987e.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(interfaceC0987e);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC1835e
    public C11467e vip(InterfaceC2268e interfaceC2268e) {
        C11467e c11467e = (C11467e) this.f14916e;
        c11467e.m3214implements((String) this.f14915e, interfaceC2268e);
        return c11467e;
    }

    public AbstractC6124e yandex(String str, int i, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f14916e;
        AbstractC6124e abstractC6124e = (AbstractC6124e) atomicReferenceArray.get(i);
        if (abstractC6124e != null) {
            return abstractC6124e;
        }
        C1663e c1663e = new C1663e(str, (C2580e) ((C8383e) this.f14915e).f17149e, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, c1663e)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC6124e abstractC6124e2 = (AbstractC6124e) atomicReferenceArray.get(i);
                abstractC6124e2.getClass();
                return abstractC6124e2;
            }
        }
        return c1663e;
    }
}
