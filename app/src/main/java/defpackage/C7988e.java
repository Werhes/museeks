package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import android.util.Size;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.adcel;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًً٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7988e implements InterfaceC2062e, InterfaceC8596e, InterfaceC16060e, InterfaceC5617e, InterfaceC2295e, InterfaceC2928e, InterfaceC14454e, InterfaceC3054e, InterfaceC8668e, InterfaceC15813e, InterfaceC14989e, InterfaceC15269e, InterfaceC18472e, InterfaceC14470e, InterfaceC13049e, InterfaceC7898e, InterfaceC9307e, InterfaceC6786e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static volatile C7988e f16175e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f16176e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16177e;

    public C7988e(float f, float f2, AbstractC3424e abstractC3424e) {
        this.f16177e = 27;
        int vip = abstractC3424e.vip();
        C6392e[] c6392eArr = new C6392e[vip];
        for (int i = 0; i < vip; i++) {
            c6392eArr[i] = new C6392e(f, f2, abstractC3424e.ad(i));
        }
        this.f16176e = c6392eArr;
    }

    public C7988e(int i) {
        this.f16177e = i;
        switch (i) {
            case 2:
                this.f16176e = new ArrayList();
                return;
            case 5:
                this.f16176e = (CloseCameraDeviceOnCameraGraphCloseQuirk) AbstractC16338e.ad(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
                return;
            case 7:
                this.f16176e = new HashMap();
                return;
            case 14:
                this.f16176e = new C12742e();
                return;
            case 22:
                this.f16176e = new Stack();
                return;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                this.f16176e = new CountDownLatch(1);
                return;
            default:
                this.f16176e = r3;
                String[] strArr = {"other", "lyrics", "text transcription", "movement/part name", "events", "chord", "trivia", "URLs to webpages", "URLs to images"};
                return;
        }
    }

    public /* synthetic */ C7988e(int i, Object obj) {
        this.f16177e = i;
        this.f16176e = obj;
    }

    public /* synthetic */ C7988e(int i, boolean z) {
        this.f16177e = i;
    }

    public C7988e(Context context) {
        this.f16177e = 1;
        this.f16176e = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    public C7988e(Context context, Uri uri) {
        this.f16177e = 10;
        this.f16176e = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public C7988e(C0624e c0624e, C16911e c16911e) {
        this.f16177e = 16;
        this.f16176e = c0624e;
    }

    public C7988e(AbstractC6785e abstractC6785e) {
        this.f16177e = 3;
        Objects.requireNonNull(abstractC6785e);
        this.f16176e = abstractC6785e;
    }

    public C7988e(C14461e c14461e) {
        this.f16177e = 4;
        this.f16176e = new File((File) c14461e.f28586e, "com.crashlytics.settings.json");
    }

    public C7988e(InterfaceC14710e interfaceC14710e, int i) {
        this.f16177e = 28;
        this.f16176e = interfaceC14710e;
    }

    public C7988e(int[] iArr, int i) {
        this.f16177e = 19;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (iArr[i2] != 0) {
                break;
            } else {
                i2++;
            }
        }
        i2 = i2 < 0 ? 0 : i2;
        int length2 = (iArr.length - i2) + i;
        int[] iArr2 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr2[i3] = 0;
        }
        this.f16176e = iArr2;
        int length3 = iArr.length - i2;
        for (int i4 = 0; i4 < length3; i4++) {
            iArr2[i4] = iArr[i2 + i4];
        }
    }

    public static C5403e firebase(InterfaceC12385e interfaceC12385e) {
        if (interfaceC12385e == null) {
            return null;
        }
        return new C5403e(interfaceC12385e, new Size(interfaceC12385e.getWidth(), interfaceC12385e.vip()), new C2261e(new C7699e((InterfaceC8500e) null, C18543e.vip, interfaceC12385e.mo691synchronized().metrica())));
    }

    /* renamed from: this, reason: not valid java name */
    public static C7988e m2361this() {
        if (f16175e == null) {
            synchronized (C7988e.class) {
                try {
                    if (f16175e == null) {
                        f16175e = new C7988e(0);
                    }
                } finally {
                }
            }
        }
        return f16175e;
    }

    @Override // defpackage.InterfaceC8596e
    public void Signature(C14758e c14758e) {
        AbstractC6785e abstractC6785e = (AbstractC6785e) this.f16176e;
        if (c14758e.f29190e == 0) {
            abstractC6785e.smaato(null, abstractC6785e.amazon());
            return;
        }
        InterfaceC5560e interfaceC5560e = abstractC6785e.admob;
        if (interfaceC5560e != null) {
            interfaceC5560e.adcel(c14758e);
        }
    }

    /* renamed from: abstract, reason: not valid java name */
    public boolean m2362abstract(C15695e c15695e, C14542e c14542e, C17201e c17201e) {
        C4421e license;
        if (c15695e == null || !AbstractC10257e.license(c14542e.mopub) || !c17201e.ad.purchase() || (license = ((C0624e) this.f16176e).license()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c17201e.vip));
        String str = c17201e.license;
        if (str != null) {
            linkedHashMap.put("coil#disk_cache_key", str);
        }
        InterfaceC4082e interfaceC4082e = c17201e.ad;
        Map license2 = AbstractC18467e.license(linkedHashMap);
        synchronized (license.metrica) {
            long appmetrica = interfaceC4082e.appmetrica();
            if (appmetrica < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + appmetrica).toString());
            }
            license.ad.yandex(c15695e, interfaceC4082e, license2, appmetrica);
            Unit unit = Unit.INSTANCE;
        }
        return true;
    }

    @Override // defpackage.InterfaceC18472e
    public boolean ad(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f16176e;
        if (!swipeDismissBehavior.remoteconfig(view)) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.license;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // defpackage.InterfaceC2928e
    public Cursor adcel(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16176e;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC14454e
    public int admob(byte[] bArr) {
        int i = bArr[bArr.length - 1] & 255;
        if ((((bArr.length - i) | (i - 1)) >> 31) == 0) {
            return i;
        }
        throw new Exception("pad block corrupted");
    }

    @Override // defpackage.InterfaceC14989e
    public int ads(View view) {
        return adcel.crashlytics(view) + ((ViewGroup.MarginLayoutParams) ((C8274e) view.getLayoutParams())).rightMargin;
    }

    @Override // defpackage.InterfaceC16060e
    public long advert(C10163e c10163e, long j, EnumC7792e enumC7792e, long j2) {
        long j3 = ((C11490e) ((Function0) this.f16176e).invoke()).ad;
        return (AbstractC8457e.vip(c10163e.ad + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), enumC7792e == EnumC7792e.f15794e) << 32) | (AbstractC8457e.vip(c10163e.vip + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L);
    }

    @Override // defpackage.InterfaceC15813e
    public void amazon(C0520e c0520e, Object obj) {
        C4756e c4756e = (C4756e) this.f16176e;
        String vip = c0520e.vip();
        if ("k".equals(vip)) {
            if (obj instanceof Integer) {
                EnumC5730e enumC5730e = (EnumC5730e) EnumC5730e.f12126e.get((Integer) obj);
                if (enumC5730e == null) {
                    enumC5730e = EnumC5730e.UNKNOWN;
                }
                c4756e.f10185e = enumC5730e;
                return;
            }
            return;
        }
        if ("mv".equals(vip)) {
            if (obj instanceof int[]) {
                c4756e.f10184e = (int[]) obj;
            }
        } else {
            if ("xs".equals(vip)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    c4756e.f10181e = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(vip)) {
                "pn".equals(vip);
            } else if (obj instanceof Integer) {
                c4756e.f10180e = ((Integer) obj).intValue();
            }
        }
    }

    @Override // defpackage.InterfaceC14989e
    public View applovin(int i) {
        return ((adcel) this.f16176e).signatures(i);
    }

    @Override // defpackage.InterfaceC8668e
    public int appmetrica() {
        return ((C12309e) this.f16176e).appmetrica();
    }

    @Override // defpackage.InterfaceC8668e
    public void billing() {
        ((C12309e) this.f16176e).billing();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: break, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2363break(defpackage.C9398e r7, java.lang.String r8, defpackage.C11265e r9, defpackage.AbstractC10731e r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f16176e
            eؙۗۗ r0 = (defpackage.C6594e) r0
            boolean r1 = r10 instanceof defpackage.C13473e
            if (r1 == 0) goto L17
            r1 = r10
            eْۙٞ r1 = (defpackage.C13473e) r1
            int r2 = r1.f26743e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f26743e = r2
            goto L1c
        L17:
            eْۙٞ r1 = new eْۙٞ
            r1.<init>(r6, r10)
        L1c:
            java.lang.Object r10 = r1.f26741e
            int r2 = r1.f26743e
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.String r7 = r1.f26742e
            defpackage.AbstractC2003e.purchase(r10)
            goto L9e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.String r8 = r1.f26742e
            defpackage.AbstractC2003e.purchase(r10)
            goto L6e
        L3e:
            defpackage.AbstractC2003e.purchase(r10)
            eَٔٔ r10 = new eَٔٔ
            r10.<init>()
            java.lang.String r2 = "/v1/auth/token"
            defpackage.AbstractC4882e.ad(r10, r2)
            r9.invoke(r10)
            java.lang.String r9 = "grant_type"
            java.lang.String r2 = "refresh_token"
            defpackage.AbstractC6069e.yandex(r10, r9, r2)
            defpackage.AbstractC6069e.yandex(r10, r2, r8)
            eؕ٘٘ r9 = defpackage.C3434e.vip
            r10.vip = r9
            eْٝۜ r9 = new eْٝۜ
            r2 = 26
            r9.<init>(r10, r7, r2)
            r1.f26742e = r8
            r1.f26743e = r4
            java.lang.Object r10 = r9.loadAd(r1)
            if (r10 != r5) goto L6e
            goto L9c
        L6e:
            eؘٗٙ r10 = (defpackage.AbstractC16824e) r10
            eۣؔؗ r7 = r10.billing()
            eۣؔؗ r9 = defpackage.C2394e.f6116e
            boolean r7 = defpackage.AbstractC7890e.billing(r7, r9)
            r9 = 0
            if (r7 == 0) goto Lcc
            eؗٝٝ r7 = r10.vip()
            eؙّؔ r10 = defpackage.AbstractC3820e.ad
            java.lang.Class<eؕٔٗ> r2 = defpackage.C3365e.class
            eؚ٘ٚ r10 = r10.vip(r2)
            eٓٔۖ r9 = defpackage.AbstractC3820e.ad(r2)     // Catch: java.lang.Throwable -> L8d
        L8d:
            eِ۟ۥ r2 = new eِ۟ۥ
            r2.<init>(r10, r9)
            r1.f26742e = r8
            r1.f26743e = r3
            java.lang.Object r10 = r7.ad(r2, r1)
            if (r10 != r5) goto L9d
        L9c:
            return r5
        L9d:
            r7 = r8
        L9e:
            if (r10 == 0) goto Lc4
            eؕٔٗ r10 = (defpackage.C3365e) r10
            eُؚۗ r8 = new eُؚۗ
            java.lang.String r9 = r10.ad
            eؚْۤ r1 = defpackage.AbstractC15962e.ad
            eؘؘۢ r1 = r1.purchase()
            int r10 = r10.metrica
            eْٗ٘ r2 = defpackage.AbstractC0894e.Companion
            r2.getClass()
            eؚّ٘ r2 = defpackage.AbstractC0894e.ad
            eؘؘۢ r10 = defpackage.AbstractC15297e.appmetrica(r1, r10, r2)
            long r1 = r10.metrica()
            r8.<init>(r1, r9, r7)
            defpackage.AbstractC9476e.Signature(r0, r8)
            return r8
        Lc4:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type bruhcollective.itaysonlab.spark.objects.authorization.SparkOAuthResponse"
            r7.<init>(r8)
            throw r7
        Lcc:
            defpackage.AbstractC9476e.yandex(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7988e.m2363break(eٍُۘ, java.lang.String, eُٖۛ, eُؑ۠):java.lang.Object");
    }

    /* renamed from: class, reason: not valid java name */
    public void m2364class(AbstractC6732e abstractC6732e) {
        if (!abstractC6732e.advert()) {
            if (!(abstractC6732e instanceof C1152e)) {
                String valueOf = String.valueOf(abstractC6732e.getClass());
                throw new IllegalArgumentException(AbstractC1786e.signatures(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
            }
            C1152e c1152e = (C1152e) abstractC6732e;
            m2364class(c1152e.f3731e);
            m2364class(c1152e.f3733e);
            return;
        }
        int size = abstractC6732e.size();
        int[] iArr = C1152e.f3729e;
        int binarySearch = Arrays.binarySearch(iArr, size);
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int i = iArr[binarySearch + 1];
        Stack stack = (Stack) this.f16176e;
        if (stack.isEmpty() || ((AbstractC6732e) stack.peek()).size() >= i) {
            stack.push(abstractC6732e);
            return;
        }
        int i2 = iArr[binarySearch];
        AbstractC6732e abstractC6732e2 = (AbstractC6732e) stack.pop();
        while (!stack.isEmpty() && ((AbstractC6732e) stack.peek()).size() < i2) {
            abstractC6732e2 = new C1152e((AbstractC6732e) stack.pop(), abstractC6732e2);
        }
        C1152e c1152e2 = new C1152e(abstractC6732e2, abstractC6732e);
        while (!stack.isEmpty()) {
            int[] iArr2 = C1152e.f3729e;
            int binarySearch2 = Arrays.binarySearch(iArr2, c1152e2.f3732e);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((AbstractC6732e) stack.peek()).size() >= iArr2[binarySearch2 + 1]) {
                break;
            } else {
                c1152e2 = new C1152e((AbstractC6732e) stack.pop(), c1152e2);
            }
        }
        stack.push(c1152e2);
    }

    @Override // defpackage.InterfaceC2928e, defpackage.InterfaceC8668e
    public void close() {
        switch (this.f16177e) {
            case 10:
                ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16176e;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    return;
                }
                return;
            default:
                ((C12309e) this.f16176e).close();
                return;
        }
    }

    @Override // defpackage.InterfaceC15813e
    public void crashlytics(C0520e c0520e, C11709e c11709e, C0520e c0520e2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0122, code lost:
    
        if (r0 == r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
    
        if (r0 == r9) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[Catch: all -> 0x004f, LOOP:0: B:39:0x009f->B:41:0x00a5, LOOP_END, TryCatch #2 {all -> 0x004f, blocks: (B:37:0x004b, B:38:0x0095, B:39:0x009f, B:41:0x00a5, B:43:0x00bb), top: B:36:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: default, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2365default(defpackage.C9398e r15, defpackage.C11265e r16, defpackage.AbstractC10731e r17) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7988e.m2365default(eٍُۘ, eُٖۛ, eُؑ۠):java.lang.Object");
    }

    /* renamed from: extends, reason: not valid java name */
    public C15695e m2366extends(C14542e c14542e, Object obj, C6302e c6302e, C4335e c4335e) {
        String str;
        int i = c14542e.mopub;
        Map map = c14542e.appmetrica;
        if (i != 4) {
            String str2 = c14542e.license;
            if (str2 != null) {
                return new C15695e(str2, map);
            }
            List list = ((C0624e) this.f16176e).license.metrica;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    str = null;
                    break;
                }
                C6571e c6571e = (C6571e) list.get(i2);
                InterfaceC17863e interfaceC17863e = (InterfaceC17863e) c6571e.f13544e;
                if (((InterfaceC7227e) c6571e.f13543e).applovin(obj) && (str = interfaceC17863e.ad(obj, c6302e)) != null) {
                    break;
                }
                i2++;
            }
            if (str != null) {
                if (((List) AbstractC8306e.metrica(c14542e, AbstractC2182e.ad)).isEmpty()) {
                    return new C15695e(str, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", c6302e.vip.toString());
                return new C15695e(str, linkedHashMap);
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public void mo268e(Exception exc) {
        ((CountDownLatch) this.f16176e).countDown();
    }

    @Override // defpackage.InterfaceC13049e
    public InterfaceC3454e get(int i) {
        return ((C6392e[]) this.f16176e)[i];
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        return new C18447e((C4473e) ((InterfaceC18006e) this.f16176e).get());
    }

    @Override // defpackage.InterfaceC8668e
    public Surface getSurface() {
        return ((C12309e) this.f16176e).getSurface();
    }

    @Override // defpackage.InterfaceC2062e
    public String getValue(int i) {
        String str;
        return (mo269instanceof(i) && (str = ((String[]) this.f16176e)[i]) != null) ? str : BuildConfig.FLAVOR;
    }

    @Override // defpackage.InterfaceC8668e
    public int getWidth() {
        return ((C12309e) this.f16176e).getWidth();
    }

    @Override // defpackage.InterfaceC15813e
    /* renamed from: goto, reason: not valid java name */
    public InterfaceC15813e mo2367goto(C11709e c11709e, C0520e c0520e) {
        return null;
    }

    @Override // defpackage.InterfaceC8668e
    public InterfaceC12385e inmobi() {
        return firebase(((C12309e) this.f16176e).inmobi());
    }

    @Override // defpackage.InterfaceC2062e
    /* renamed from: instanceof */
    public boolean mo269instanceof(int i) {
        return i >= 0 && i <= 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
    
        if (r14 <= 1.0d) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0141, code lost:
    
        if (r14 == 1.0d) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /* renamed from: interface, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.C4123e m2368interface(defpackage.C14542e r17, defpackage.C15695e r18, defpackage.C16320e r19, int r20) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7988e.m2368interface(eؘٔؕ, eٕۙۦ, eٖٚۢ, int):eّٕؖ");
    }

    @Override // defpackage.InterfaceC14454e
    public void isPro(SecureRandom secureRandom) {
        if (secureRandom == null) {
            secureRandom = AbstractC9915e.vip();
        } else {
            ThreadLocal threadLocal = AbstractC9915e.ad;
        }
        this.f16176e = secureRandom;
    }

    @Override // defpackage.InterfaceC8668e
    public int isVip() {
        return ((C12309e) this.f16176e).isVip();
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        switch (this.f16177e) {
            case 9:
                C9030e c9030e = (C9030e) obj;
                C18405e c18405e = (C18405e) this.f16176e;
                long startapp = c18405e.admob.startapp();
                C18405e c18405e2 = c9030e.startapp;
                AtomicBoolean atomicBoolean = c9030e.purchase;
                if (!c18405e2.metrica) {
                    startapp = c18405e2.mopub(startapp);
                }
                if (atomicBoolean.get()) {
                    throw new IllegalStateException("The buffer is submitted or canceled.");
                }
                AbstractC4265e.metrica(startapp >= 0);
                c9030e.billing = startapp;
                if (atomicBoolean.get()) {
                    throw new IllegalStateException("The buffer is submitted or canceled.");
                }
                c9030e.yandex = true;
                C7169e c7169e = c9030e.appmetrica;
                ByteBuffer byteBuffer = c9030e.metrica;
                if (!atomicBoolean.getAndSet(true)) {
                    try {
                        c9030e.ad.queueInputBuffer(c9030e.vip, byteBuffer.position(), byteBuffer.limit(), c9030e.billing, c9030e.yandex ? 4 : 0);
                        c7169e.ad(null);
                    } catch (IllegalStateException e) {
                        c7169e.metrica(e);
                    }
                }
                ListenableFuture smaato = AbstractC15792e.smaato(c9030e.license);
                smaato.ad(new RunnableC17144e(smaato, new C2691e(6, this), 0), c18405e.yandex);
                return;
            default:
                ((CountDownLatch) this.f16176e).countDown();
                return;
        }
    }

    @Override // defpackage.InterfaceC14454e
    public int loadAd(int i, byte[] bArr) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            bArr[i] = (byte) ((SecureRandom) this.f16176e).nextInt();
            i++;
        }
        bArr[i] = length;
        return length;
    }

    @Override // defpackage.InterfaceC8668e
    public InterfaceC12385e metrica() {
        return firebase(((C12309e) this.f16176e).metrica());
    }

    @Override // defpackage.InterfaceC15813e
    public void mopub() {
    }

    /* renamed from: native, reason: not valid java name */
    public C7988e m2369native(C7988e c7988e) {
        int[] iArr = (int[]) this.f16176e;
        int length = iArr.length;
        int[] iArr2 = (int[]) c7988e.f16176e;
        if (length - iArr2.length < 0) {
            return this;
        }
        int i = iArr[0];
        int[] iArr3 = AbstractC12914e.vip;
        int i2 = iArr3[i] - iArr3[iArr2[0]];
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        int length2 = iArr2.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            copyOf[i4] = AbstractC12914e.ad(AbstractC12914e.vip[iArr2[i3]] + i2) ^ copyOf[i4];
            i3++;
            i4++;
        }
        return new C7988e(copyOf, 0).m2369native(c7988e);
    }

    @Override // defpackage.InterfaceC14470e
    public boolean onMenuItemClick(MenuItem menuItem) {
        Toolbar toolbar = (Toolbar) this.f16176e;
        if (toolbar.f238e.m424native()) {
            return true;
        }
        InterfaceC16080e interfaceC16080e = toolbar.f255e;
        if (interfaceC16080e == null) {
            return false;
        }
        ((C2946e) ((C0211e) interfaceC16080e).f1457e).invoke();
        return true;
    }

    public void premium(InterfaceC14232e interfaceC14232e) {
        ArrayList arrayList = (ArrayList) this.f16176e;
        if (interfaceC14232e instanceof InterfaceC7351e) {
            arrayList.add(interfaceC14232e);
        } else {
            if (!(interfaceC14232e instanceof C7725e)) {
                throw new C14803e(10);
            }
            Iterator it = ((C7725e) interfaceC14232e).ad.iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC7351e) it.next());
            }
        }
    }

    @Override // defpackage.InterfaceC8668e
    public void pro(InterfaceC14599e interfaceC14599e, Executor executor) {
        ((C12309e) this.f16176e).pro(new C18070e(this, interfaceC14599e, 15), executor);
    }

    /* renamed from: protected, reason: not valid java name */
    public JSONObject m2370protected() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f16176e;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(AbstractC6494e.admob(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        AbstractC6494e.billing(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    AbstractC6494e.billing(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            AbstractC6494e.billing(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC6494e.billing(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14989e
    public int purchase(View view) {
        return adcel.ads(view) - ((ViewGroup.MarginLayoutParams) ((C8274e) view.getLayoutParams())).leftMargin;
    }

    @Override // defpackage.InterfaceC15813e
    public void remoteconfig(C0520e c0520e, C5302e c5302e) {
    }

    @Override // defpackage.InterfaceC14989e
    public int smaato() {
        adcel adcelVar = (adcel) this.f16176e;
        return adcelVar.amazon - adcelVar.m166this();
    }

    @Override // defpackage.InterfaceC14989e
    public int startapp() {
        return ((adcel) this.f16176e).m161goto();
    }

    @Override // defpackage.InterfaceC5617e
    public AbstractC9027e subs(ByteArrayInputStream byteArrayInputStream) {
        boolean z;
        C16833e c16833e = (C16833e) this.f16176e;
        int read = byteArrayInputStream.read();
        if (read < 0) {
            throw new EOFException();
        }
        if (read == 0) {
            throw new IOException("Sender's public key invalid.");
        }
        if (read == 2 || read == 3) {
            z = true;
        } else {
            if (read != 4 && read != 6 && read != 7) {
                throw new IOException("Sender's public key has invalid point encoding 0x" + Integer.toString(read, 16));
            }
            z = false;
        }
        AbstractC0362e abstractC0362e = c16833e.f32975e;
        int mopub = abstractC0362e.mopub();
        if (!z) {
            mopub *= 2;
        }
        int i = mopub + 1;
        byte[] bArr = new byte[i];
        bArr[0] = (byte) read;
        int i2 = i - 1;
        if (AbstractC9460e.license(byteArrayInputStream, bArr, 1, i2) == i2) {
            return new C2964e(abstractC0362e.billing(bArr), c16833e);
        }
        throw new EOFException();
    }

    @Override // defpackage.InterfaceC6786e
    public void subscription() {
        ((CountDownLatch) this.f16176e).countDown();
    }

    @Override // defpackage.InterfaceC15813e
    public InterfaceC11429e tapsense(C0520e c0520e) {
        String vip = c0520e.vip();
        if ("d1".equals(vip)) {
            return new C16134e(this, 0);
        }
        if ("d2".equals(vip)) {
            return new C16134e(this, 1);
        }
        return null;
    }

    /* renamed from: throw, reason: not valid java name */
    public void m2371throw(AbstractC16709e abstractC16709e, C16289e c16289e, Collection collection) {
        C14090e c14090e = (C14090e) this.f16176e;
        if (abstractC16709e != c14090e.isPro || c16289e == null) {
            if (abstractC16709e == c14090e.appmetrica) {
                if (c16289e != null) {
                    c14090e.Signature(c14090e.license, c16289e);
                }
                C14756e ad = c14090e.license.ad();
                if (ad != null) {
                    ad.Signature(collection);
                    return;
                }
                return;
            }
            return;
        }
        C9701e c9701e = c14090e.inmobi.ad;
        String license = c16289e.license();
        C14756e c14756e = new C14756e(c9701e, license, c14090e.vip(c9701e, license));
        c14756e.startapp(c16289e);
        if (c14090e.license == c14756e) {
            return;
        }
        AbstractC16709e abstractC16709e2 = c14090e.isPro;
        C6541e c6541e = c14090e.inmobi;
        C16755e c16755e = c14090e.purchase;
        if (c16755e != null) {
            AbstractC13922e abstractC13922e = c16755e.ad;
            if (!c16755e.startapp && !c16755e.adcel) {
                c16755e.adcel = true;
                if (abstractC13922e != null) {
                    abstractC13922e.yandex(0);
                    abstractC13922e.license();
                }
            }
            c14090e.purchase = null;
        }
        C16755e c16755e2 = new C16755e(c14090e, c14756e, abstractC16709e2, 3, true, c6541e, collection);
        c14090e.purchase = c16755e2;
        c16755e2.ad();
        c14090e.inmobi = null;
        c14090e.isPro = null;
    }

    public String toString() {
        switch (this.f16177e) {
            case 13:
                StringBuilder sb = new StringBuilder();
                C3646e c3646e = (C3646e) this.f16176e;
                sb.append(c3646e);
                sb.append(": ");
                C0394e c0394e = c3646e.f8202e;
                InterfaceC8614e interfaceC8614e = C3646e.f8199e[0];
                sb.append(((Map) c0394e.invoke()).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: try, reason: not valid java name */
    public void m2372try(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            m2373while((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.InterfaceC8668e
    public int vip() {
        return ((C12309e) this.f16176e).vip();
    }

    /* renamed from: while, reason: not valid java name */
    public void m2373while(String str, Object obj) {
        HashMap hashMap = (HashMap) this.f16176e;
        if (obj == null) {
            hashMap.put(str, null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
            hashMap.put(str, obj);
            return;
        }
        int i = 0;
        if (cls == boolean[].class) {
            boolean[] zArr = (boolean[]) obj;
            String str2 = C13198e.vip;
            Boolean[] boolArr = new Boolean[zArr.length];
            while (i < zArr.length) {
                boolArr[i] = Boolean.valueOf(zArr[i]);
                i++;
            }
            hashMap.put(str, boolArr);
            return;
        }
        if (cls == byte[].class) {
            byte[] bArr = (byte[]) obj;
            String str3 = C13198e.vip;
            Byte[] bArr2 = new Byte[bArr.length];
            while (i < bArr.length) {
                bArr2[i] = Byte.valueOf(bArr[i]);
                i++;
            }
            hashMap.put(str, bArr2);
            return;
        }
        if (cls == int[].class) {
            int[] iArr = (int[]) obj;
            String str4 = C13198e.vip;
            Integer[] numArr = new Integer[iArr.length];
            while (i < iArr.length) {
                numArr[i] = Integer.valueOf(iArr[i]);
                i++;
            }
            hashMap.put(str, numArr);
            return;
        }
        if (cls == long[].class) {
            long[] jArr = (long[]) obj;
            String str5 = C13198e.vip;
            Long[] lArr = new Long[jArr.length];
            while (i < jArr.length) {
                lArr[i] = Long.valueOf(jArr[i]);
                i++;
            }
            hashMap.put(str, lArr);
            return;
        }
        if (cls == float[].class) {
            float[] fArr = (float[]) obj;
            String str6 = C13198e.vip;
            Float[] fArr2 = new Float[fArr.length];
            while (i < fArr.length) {
                fArr2[i] = Float.valueOf(fArr[i]);
                i++;
            }
            hashMap.put(str, fArr2);
            return;
        }
        if (cls != double[].class) {
            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
        }
        double[] dArr = (double[]) obj;
        String str7 = C13198e.vip;
        Double[] dArr2 = new Double[dArr.length];
        while (i < dArr.length) {
            dArr2[i] = Double.valueOf(dArr[i]);
            i++;
        }
        hashMap.put(str, dArr2);
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        ((C18405e) this.f16176e).ad(0, "Unable to acquire InputBuffer.", th);
    }
}
