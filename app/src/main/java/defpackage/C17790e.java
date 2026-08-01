package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17790e implements InterfaceC7600e, InterfaceC3529e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final byte[] f34877e = new byte[0];

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f34878e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f34879e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f34880e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f34881e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34882e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f34883e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f34884e;

    public C17790e(int i) {
        this.f34882e = i;
        switch (i) {
            case 6:
                this.f34879e = new C9340e[32];
                this.f34881e = new float[32];
                this.f34884e = new byte[32];
                C12618e c12618e = AbstractC1710e.ad;
                this.f34878e = new C12618e();
                this.f34883e = new C12618e();
                return;
            default:
                this.f34879e = new Object();
                this.f34881e = new Object();
                this.f34878e = new Object();
                this.f34884e = f34877e;
                this.f34883e = AbstractC18039e.appmetrica(3, new C11689e(29));
                AbstractC18039e.appmetrica(3, new C13465e(21, this));
                return;
        }
    }

    public C17790e(Context context, SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e, int i, Looper looper, Looper looper2, C17381e c17381e) {
        this.f34882e = 7;
        this.f34879e = context.getApplicationContext();
        this.f34881e = surfaceHolderCallbackC0960e;
        C17790e c17790e = new C17790e(new C13843e(false, i, 0, 0, 0), looper, looper2, c17381e, new C2007e(11, this));
        this.f34878e = c17790e;
        c17790e.m4427extends(new RunnableC9766e(this, i, 13));
    }

    public C17790e(View view) {
        this.f34882e = 1;
        this.f34880e = -1;
        this.f34879e = view;
        this.f34881e = C17264e.ad();
    }

    public C17790e(InterfaceC8946e interfaceC8946e) {
        this.f34882e = 5;
        this.f34879e = interfaceC8946e;
        this.f34881e = new ArrayDeque();
        this.f34878e = new ArrayDeque();
        this.f34884e = new PriorityQueue();
        this.f34880e = -1;
    }

    public C17790e(C17974e c17974e, InterfaceC15348e interfaceC15348e, AbstractC8441e abstractC8441e, AbstractC8441e abstractC8441e2, LongPointerWrapper longPointerWrapper) {
        this.f34882e = 4;
        this.f34879e = c17974e;
        this.f34881e = interfaceC15348e;
        this.f34878e = abstractC8441e;
        this.f34884e = abstractC8441e2;
        this.f34883e = longPointerWrapper;
    }

    public C17790e(Object obj, Looper looper, Looper looper2, C17381e c17381e, InterfaceC16205e interfaceC16205e) {
        this.f34882e = 2;
        this.f34879e = c17381e.ad(looper, null);
        this.f34881e = c17381e.ad(looper2, null);
        this.f34883e = obj;
        this.f34884e = obj;
        this.f34878e = interfaceC16205e;
    }

    public C17790e(SocketAddress socketAddress, SocketAddress socketAddress2, String str, String str2, C3434e c3434e) {
        this.f34882e = 3;
        this.f34879e = socketAddress;
        this.f34881e = socketAddress2;
        this.f34878e = str;
        this.f34884e = str2;
        this.f34883e = c3434e;
        C16063e c16063e = C16063e.f31627e;
        String m3398extends = AbstractC12797e.m3398extends("http");
        C16063e c16063e2 = (C16063e) C16063e.f31626e.get(m3398extends);
        this.f34880e = (c16063e2 == null ? new C16063e(m3398extends, 0) : c16063e2).f31629e;
    }

    @Override // defpackage.InterfaceC3529e
    public C6571e Signature(int i) {
        ((InterfaceC15348e) this.f34881e).mo3328goto();
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f34883e;
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_t realm_value_tVar2 = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        long j = i;
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_get(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar, realm_value_tVar2.ad, realm_value_tVar2);
        return new C6571e(((AbstractC8441e) this.f34884e).license(realm_value_tVar), ((AbstractC8441e) this.f34878e).license(realm_value_tVar2));
    }

    /* renamed from: abstract, reason: not valid java name */
    public void m4422abstract(PorterDuff.Mode mode) {
        if (((C0142e) this.f34884e) == null) {
            this.f34884e = new Object();
        }
        C0142e c0142e = (C0142e) this.f34884e;
        c0142e.f1375e = mode;
        c0142e.f1376e = true;
        license();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r10 < r3.f14018e) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ad(long r10, defpackage.C1292e r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f34878e
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.f34884e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.f34880e
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.f34880e
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            eؙۧ٘ r3 = (defpackage.C6808e) r3
            java.lang.String r5 = defpackage.AbstractC9413e.ad
            long r5 = r3.f14018e
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.f34881e
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            eؒۙۚ r3 = new eؒۙۚ
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            eؒۙۚ r3 = (defpackage.C1292e) r3
        L45:
            int r5 = r12.ad()
            r3.m564extends(r5)
            byte[] r5 = r12.ad
            int r12 = r12.vip
            byte[] r6 = r3.ad
            int r7 = r3.ad()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.f34883e
            eؙۧ٘ r12 = (defpackage.C6808e) r12
            if (r12 == 0) goto L6c
            long r5 = r12.f14018e
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r10 = r12.f14019e
            r10.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            eؙۧ٘ r12 = new eؙۧ٘
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            eؙۧ٘ r12 = (defpackage.C6808e) r12
        L7e:
            java.util.ArrayList r0 = r12.f14019e
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            defpackage.AbstractC2301e.billing(r8)
            boolean r2 = r0.isEmpty()
            defpackage.AbstractC2301e.subscription(r2)
            r12.f14018e = r10
            r0.add(r3)
            r1.add(r12)
            r9.f34883e = r12
            int r10 = r9.f34880e
            if (r10 == r4) goto L9e
            r9.adcel(r10)
        L9e:
            return
        L9f:
            java.lang.Object r0 = r9.f34879e
            eٌۙۛ r0 = (defpackage.InterfaceC8946e) r0
            r0.adcel(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17790e.ad(long, eؒۙۚ):void");
    }

    public void adcel(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f34884e;
        while (priorityQueue.size() > i) {
            C6808e c6808e = (C6808e) priorityQueue.poll();
            String str = AbstractC9413e.ad;
            int i2 = 0;
            while (true) {
                arrayList = c6808e.f14019e;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((InterfaceC8946e) this.f34879e).adcel(c6808e.f14018e, (C1292e) arrayList.get(i2));
                ((ArrayDeque) this.f34881e).push((C1292e) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            C6808e c6808e2 = (C6808e) this.f34883e;
            if (c6808e2 != null && c6808e2.f14018e == c6808e.f14018e) {
                this.f34883e = null;
            }
            ((ArrayDeque) this.f34878e).push(c6808e);
        }
    }

    @Override // defpackage.InterfaceC3529e
    public C6571e admob(Object obj) {
        return AbstractC5087e.metrica(this, obj);
    }

    @Override // defpackage.InterfaceC3529e
    public C6571e ads(Object obj, Object obj2, LinkedHashMap linkedHashMap) {
        return AbstractC5087e.billing(this, obj, obj2, linkedHashMap);
    }

    @Override // defpackage.InterfaceC3529e
    public C6571e advert(Object obj, Object obj2, int i, Map map) {
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = ((AbstractC8441e) this.f34884e).metrica(c15816e, obj);
        AbstractC8441e abstractC8441e = (AbstractC8441e) this.f34878e;
        realm_value_t metrica2 = abstractC8441e.metrica(c15816e, obj2);
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f34883e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, metrica.ad, metrica, realm_value_tVar.ad, realm_value_tVar, new boolean[1]);
        boolean[] zArr = new boolean[1];
        realmcJNI.realm_dictionary_insert(longPointerWrapper.getPtr$cinterop_release(), metrica.ad, metrica, metrica2.ad, metrica2, new long[1], zArr);
        C6571e c6571e = new C6571e(abstractC8441e.license(realm_value_tVar), Boolean.valueOf(zArr[0]));
        c15816e.m4020interface();
        return c6571e;
    }

    public Object amazon() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == ((C2399e) this.f34881e).ad.getLooper()) {
            return this.f34883e;
        }
        AbstractC2301e.subscription(myLooper == ((C2399e) this.f34879e).ad.getLooper());
        return this.f34884e;
    }

    public void applovin(AttributeSet attributeSet, int i) {
        ColorStateList startapp;
        View view = (View) this.f34879e;
        Context context = view.getContext();
        int[] iArr = AbstractC6062e.applovin;
        C0912e advert = C0912e.advert(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) advert.f3331e;
        View view2 = (View) this.f34879e;
        AbstractC2016e.amazon(view2, view2.getContext(), iArr, attributeSet, (TypedArray) advert.f3331e, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f34880e = typedArray.getResourceId(0, -1);
                C17264e c17264e = (C17264e) this.f34881e;
                Context context2 = view.getContext();
                int i2 = this.f34880e;
                synchronized (c17264e) {
                    startapp = c17264e.ad.startapp(context2, i2);
                }
                if (startapp != null) {
                    m4436while(startapp);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(advert.purchase(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC13982e.metrica(typedArray.getInt(2, -1), null));
            }
            advert.amazon();
        } catch (Throwable th) {
            advert.amazon();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC3529e
    public int appmetrica() {
        return AbstractC5087e.purchase(this);
    }

    public void billing() {
        byte[] bArr = (byte[]) this.f34884e;
        byte[] bArr2 = f34877e;
        if (bArr == bArr2) {
            return;
        }
        ((C3019e) this.f34878e).close();
        ((C16151e) this.f34881e).skip(this.f34880e);
        ((C16151e) this.f34881e).mo2629class((C16151e) this.f34879e);
        C16151e c16151e = (C16151e) this.f34879e;
        this.f34879e = (C16151e) this.f34881e;
        this.f34881e = c16151e;
        this.f34884e = bArr2;
        this.f34880e = 0;
    }

    /* renamed from: break, reason: not valid java name */
    public void m4423break(ColorStateList colorStateList) {
        if (((C0142e) this.f34884e) == null) {
            this.f34884e = new Object();
        }
        C0142e c0142e = (C0142e) this.f34884e;
        c0142e.f1373e = colorStateList;
        c0142e.f1374e = true;
        license();
    }

    /* renamed from: case, reason: not valid java name */
    public void m4424case(C0193e c0193e) {
        int license = c0193e.license();
        while (license != 0) {
            m4434this(1);
            int min = Math.min(this.f34880e, license);
            int i = this.f34880e - min;
            this.f34880e = i;
            license -= min;
            c0193e.metrica(license, i, min, (byte[]) this.f34884e);
        }
    }

    /* renamed from: catch, reason: not valid java name */
    public void m4425catch(int i) {
        m4434this(4);
        int i2 = this.f34880e;
        int i3 = i2 - 4;
        this.f34880e = i3;
        byte[] bArr = (byte[]) this.f34884e;
        bArr[i3] = (byte) (i & 255);
        bArr[i2 - 3] = (byte) ((i >>> 8) & 255);
        bArr[i2 - 2] = (byte) ((i >>> 16) & 255);
        bArr[i2 - 1] = (byte) ((i >>> 24) & 255);
    }

    @Override // defpackage.InterfaceC3529e
    /* renamed from: class */
    public boolean mo1370class(Object obj, Object obj2) {
        if (obj instanceof byte[]) {
            return Arrays.equals((byte[]) obj, obj2 != null ? (byte[]) obj2 : null);
        }
        return AbstractC7890e.billing(obj, obj2);
    }

    @Override // defpackage.InterfaceC3529e
    public void clear() {
        AbstractC5087e.ad(this);
    }

    @Override // defpackage.InterfaceC3529e
    public boolean containsKey(Object obj) {
        return AbstractC5087e.vip(this, obj);
    }

    @Override // defpackage.InterfaceC3529e
    public boolean containsValue(Object obj) {
        ((InterfaceC15348e) this.f34881e).mo3328goto();
        C15816e c15816e = new C15816e(15);
        AbstractC8441e abstractC8441e = (AbstractC8441e) this.f34878e;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f34883e;
        realm_value_t metrica = abstractC8441e.metrica(c15816e, obj);
        long[] jArr = new long[1];
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_contains_value(ptr$cinterop_release, metrica.ad, metrica, jArr);
        boolean z = jArr[0] != -1;
        c15816e.m4020interface();
        return z;
    }

    /* renamed from: default, reason: not valid java name */
    public void m4426default(InterfaceC8223e interfaceC8223e, InterfaceC8223e interfaceC8223e2) {
        AbstractC2301e.subscription(Looper.myLooper() == ((C2399e) this.f34881e).ad.getLooper());
        this.f34880e++;
        m4427extends(new RunnableC16019e(this, interfaceC8223e2, 11));
        m4429implements(interfaceC8223e.apply(this.f34883e));
    }

    /* renamed from: extends, reason: not valid java name */
    public void m4427extends(Runnable runnable) {
        C2399e c2399e = (C2399e) this.f34879e;
        if (c2399e.ad.getLooper().getThread().isAlive()) {
            c2399e.license(runnable);
        }
    }

    /* renamed from: final, reason: not valid java name */
    public void m4428final(long j) {
        m4434this(8);
        int i = this.f34880e;
        int i2 = i - 8;
        this.f34880e = i2;
        byte[] bArr = (byte[]) this.f34884e;
        bArr[i2] = (byte) (j & 255);
        bArr[i - 7] = (byte) ((j >>> 8) & 255);
        bArr[i - 6] = (byte) ((j >>> 16) & 255);
        bArr[i - 5] = (byte) ((j >>> 24) & 255);
        bArr[i - 4] = (byte) ((j >>> 32) & 255);
        bArr[i - 3] = (byte) ((j >>> 40) & 255);
        bArr[i - 2] = (byte) ((j >>> 48) & 255);
        bArr[i - 1] = (byte) ((j >>> 56) & 255);
    }

    @Override // defpackage.InterfaceC3529e
    public Object get(Object obj) {
        ((InterfaceC15348e) this.f34881e).mo3328goto();
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = ((AbstractC8441e) this.f34884e).metrica(c15816e, obj);
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f34883e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, metrica.ad, metrica, realm_value_tVar.ad, realm_value_tVar, new boolean[1]);
        Object license = ((AbstractC8441e) this.f34878e).license(realm_value_tVar);
        c15816e.m4020interface();
        return license;
    }

    /* renamed from: implements, reason: not valid java name */
    public void m4429implements(Object obj) {
        Object obj2 = this.f34883e;
        this.f34883e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        ((InterfaceC16205e) this.f34878e).ad(obj2, obj);
    }

    /* renamed from: interface, reason: not valid java name */
    public void m4430interface(int i) {
        ColorStateList colorStateList;
        this.f34880e = i;
        C17264e c17264e = (C17264e) this.f34881e;
        if (c17264e != null) {
            Context context = ((View) this.f34879e).getContext();
            synchronized (c17264e) {
                colorStateList = c17264e.ad.startapp(context, i);
            }
        } else {
            colorStateList = null;
        }
        m4436while(colorStateList);
        license();
    }

    public PorterDuff.Mode isPro() {
        C0142e c0142e = (C0142e) this.f34884e;
        if (c0142e != null) {
            return (PorterDuff.Mode) c0142e.f1375e;
        }
        return null;
    }

    public void license() {
        View view = (View) this.f34879e;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C0142e) this.f34878e) != null) {
                if (((C0142e) this.f34883e) == null) {
                    this.f34883e = new Object();
                }
                C0142e c0142e = (C0142e) this.f34883e;
                c0142e.f1373e = null;
                c0142e.f1374e = false;
                c0142e.f1375e = null;
                c0142e.f1376e = false;
                WeakHashMap weakHashMap = AbstractC2016e.ad;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c0142e.f1374e = true;
                    c0142e.f1373e = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c0142e.f1376e = true;
                    c0142e.f1375e = backgroundTintMode;
                }
                if (c0142e.f1374e || c0142e.f1376e) {
                    C17264e.appmetrica(background, c0142e, view.getDrawableState());
                    return;
                }
            }
            C0142e c0142e2 = (C0142e) this.f34884e;
            if (c0142e2 != null) {
                C17264e.appmetrica(background, c0142e2, view.getDrawableState());
                return;
            }
            C0142e c0142e3 = (C0142e) this.f34878e;
            if (c0142e3 != null) {
                C17264e.appmetrica(background, c0142e3, view.getDrawableState());
            }
        }
    }

    @Override // defpackage.InterfaceC3529e
    public Object loadAd(Object obj, Object obj2, int i, Map map) {
        return AbstractC5087e.remoteconfig(this, obj, obj2, i, map);
    }

    @Override // defpackage.InterfaceC3529e
    public InterfaceC3529e metrica(InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        return new C17790e((C17974e) this.f34879e, interfaceC15348e, (AbstractC8441e) this.f34878e, (AbstractC8441e) this.f34884e, longPointerWrapper);
    }

    public C13843e mopub(int i) {
        int streamMaxVolume;
        ((AudioManager) this.f34884e).getClass();
        AudioManager audioManager = (AudioManager) this.f34884e;
        try {
            streamMaxVolume = audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i, e);
            streamMaxVolume = audioManager.getStreamMaxVolume(i);
        }
        return new C13843e(((AudioManager) this.f34884e).isStreamMute(i), i, streamMaxVolume, AbstractC17305e.m4280class((AudioManager) this.f34884e, i), ((AudioManager) this.f34884e).getStreamMaxVolume(i));
    }

    @Override // defpackage.InterfaceC3529e
    /* renamed from: native */
    public void mo1371native(InterfaceC6128e interfaceC6128e, int i, Map map) {
        AbstractC5087e.pro(this, interfaceC6128e, i, map);
    }

    /* renamed from: new, reason: not valid java name */
    public void m4431new(long j) {
        int adcel = AbstractC8141e.adcel(j);
        m4434this(adcel);
        int i = this.f34880e - adcel;
        this.f34880e = i;
        while (((-128) & j) != 0) {
            ((byte[]) this.f34884e)[i] = (byte) ((127 & j) | 128);
            j >>>= 7;
            i++;
        }
        ((byte[]) this.f34884e)[i] = (byte) j;
    }

    @Override // defpackage.InterfaceC3529e
    public Object premium(NativePointer nativePointer, int i) {
        AbstractC8441e abstractC8441e = (AbstractC8441e) this.f34878e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_results_get(ptr$cinterop_release, i, realm_value_t.vip(realm_value_tVar), realm_value_tVar);
        return abstractC8441e.license(realm_value_tVar);
    }

    public int pro() {
        return (((byte[]) this.f34884e).length - this.f34880e) + ((int) ((C16151e) this.f34879e).f31731e);
    }

    /* renamed from: protected, reason: not valid java name */
    public void m4432protected(Object obj) {
        this.f34884e = obj;
        RunnableC1488e runnableC1488e = new RunnableC1488e(this, 0, obj);
        C2399e c2399e = (C2399e) this.f34881e;
        if (c2399e.ad.getLooper().getThread().isAlive()) {
            c2399e.license(runnableC1488e);
        }
    }

    @Override // defpackage.InterfaceC3529e
    public void purchase(int i) {
        this.f34880e = i;
    }

    @Override // defpackage.InterfaceC3529e
    public Object remove(Object obj) {
        return AbstractC5087e.signatures(this, obj);
    }

    @Override // defpackage.InterfaceC3529e
    public C6571e smaato(Object obj) {
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = ((AbstractC8441e) this.f34884e).metrica(c15816e, obj);
        AbstractC8441e abstractC8441e = (AbstractC8441e) this.f34878e;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f34883e;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, metrica.ad, metrica, realm_value_tVar.ad, realm_value_tVar, new boolean[1]);
        boolean[] zArr = new boolean[1];
        realmcJNI.realm_dictionary_erase(longPointerWrapper.getPtr$cinterop_release(), metrica.ad, metrica, zArr);
        C6571e c6571e = new C6571e(abstractC8441e.license(realm_value_tVar), Boolean.valueOf(zArr[0]));
        c15816e.m4020interface();
        return c6571e;
    }

    @Override // defpackage.InterfaceC3529e
    public int startapp() {
        return this.f34880e;
    }

    public void subs() {
        this.f34880e = -1;
        m4436while(null);
        license();
    }

    @Override // defpackage.InterfaceC3529e
    public Object subscription(NativePointer nativePointer, int i) {
        return AbstractC5087e.appmetrica(this, nativePointer, i);
    }

    /* renamed from: super, reason: not valid java name */
    public void m4433super(int i) {
        int i2 = (i & (-128)) == 0 ? 1 : (i & (-16384)) == 0 ? 2 : ((-2097152) & i) == 0 ? 3 : ((-268435456) & i) == 0 ? 4 : 5;
        m4434this(i2);
        int i3 = this.f34880e - i2;
        this.f34880e = i3;
        while ((i & (-128)) != 0) {
            ((byte[]) this.f34884e)[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i3++;
        }
        ((byte[]) this.f34884e)[i3] = (byte) i;
    }

    public ColorStateList tapsense() {
        C0142e c0142e = (C0142e) this.f34884e;
        if (c0142e != null) {
            return (ColorStateList) c0142e.f1373e;
        }
        return null;
    }

    /* renamed from: this, reason: not valid java name */
    public void m4434this(int i) {
        C3019e c3019e = (C3019e) this.f34878e;
        if (this.f34880e >= i) {
            return;
        }
        billing();
        C16151e c16151e = (C16151e) this.f34881e;
        c16151e.getClass();
        byte[] bArr = vip.ad;
        if (c3019e.f7077e != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c3019e.f7077e = c16151e;
        c3019e.f7076e = true;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "minByteCount <= 0: ").toString());
        }
        if (i > 8192) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "minByteCount > Segment.SIZE: ").toString());
        }
        C16151e c16151e2 = c3019e.f7077e;
        if (c16151e2 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!c3019e.f7076e) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long j = c16151e2.f31731e;
        C16592e m4130implements = c16151e2.m4130implements(i);
        int i2 = 8192 - m4130implements.metrica;
        m4130implements.metrica = 8192;
        c16151e2.f31731e = i2 + j;
        byte[] bArr2 = m4130implements.ad;
        if (j != 0 || 8192 != bArr2.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.f34884e = bArr2;
        this.f34880e = 8192;
    }

    @Override // defpackage.InterfaceC3529e
    /* renamed from: throw */
    public AbstractC8441e mo1372throw() {
        return (AbstractC8441e) this.f34884e;
    }

    public String toString() {
        String str;
        int i;
        String hostString;
        switch (this.f34882e) {
            case 3:
                SocketAddress socketAddress = (SocketAddress) this.f34879e;
                StringBuilder sb = new StringBuilder("CIOConnectionPoint(uri=");
                sb.append((String) this.f34884e);
                sb.append(", method=");
                sb.append((C3434e) this.f34883e);
                sb.append(", version=");
                sb.append((String) this.f34878e);
                sb.append(", localAddress=");
                SocketAddress socketAddress2 = (SocketAddress) this.f34881e;
                String str2 = BuildConfig.FLAVOR;
                if (socketAddress2 != null) {
                    InetSocketAddress inetSocketAddress = socketAddress2 instanceof InetSocketAddress ? (InetSocketAddress) socketAddress2 : null;
                    if (inetSocketAddress == null || (str = inetSocketAddress.getHostString()) == null) {
                        str = BuildConfig.FLAVOR;
                    }
                } else {
                    str = "localhost";
                }
                sb.append(str);
                sb.append(", localPort=");
                int i2 = 0;
                if (socketAddress2 != null) {
                    InetSocketAddress inetSocketAddress2 = socketAddress2 instanceof InetSocketAddress ? (InetSocketAddress) socketAddress2 : null;
                    i = inetSocketAddress2 != null ? inetSocketAddress2.getPort() : 0;
                } else {
                    i = this.f34880e;
                }
                sb.append(i);
                sb.append(", remoteAddress=");
                if (socketAddress != null) {
                    InetSocketAddress inetSocketAddress3 = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
                    if (inetSocketAddress3 != null && (hostString = inetSocketAddress3.getHostString()) != null) {
                        str2 = hostString;
                    }
                } else {
                    str2 = "unknown";
                }
                sb.append(str2);
                sb.append(", remotePort=");
                if (socketAddress != null) {
                    InetSocketAddress inetSocketAddress4 = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
                    if (inetSocketAddress4 != null) {
                        i2 = inetSocketAddress4.getPort();
                    }
                }
                return AbstractC1786e.pro(sb, i2, ')');
            default:
                return super.toString();
        }
    }

    /* renamed from: try, reason: not valid java name */
    public void m4435try(int i) {
        AbstractC2301e.subscription(i >= 0);
        this.f34880e = i;
        adcel(i);
    }

    @Override // defpackage.InterfaceC3529e
    public NativePointer vip() {
        return (LongPointerWrapper) this.f34883e;
    }

    /* renamed from: while, reason: not valid java name */
    public void m4436while(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0142e) this.f34878e) == null) {
                this.f34878e = new Object();
            }
            C0142e c0142e = (C0142e) this.f34878e;
            c0142e.f1373e = colorStateList;
            c0142e.f1374e = true;
        } else {
            this.f34878e = null;
        }
        license();
    }

    @Override // defpackage.InterfaceC2750e
    public InterfaceC15348e yandex() {
        return (InterfaceC15348e) this.f34881e;
    }
}
