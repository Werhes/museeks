package defpackage;

import android.R;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import ua.itaysonlab.vkxnative.BundleNativeClass;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۢؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13572e implements InterfaceC18472e, InterfaceC11206e, InterfaceC18515e, InterfaceC9483e, InterfaceC11306e, InterfaceC5282e, InterfaceC14343e, InterfaceC5204e, InterfaceC17064e, InterfaceC0987e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f26878e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f26879e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26880e;

    public C13572e(int i) {
        this.f26880e = i;
        switch (i) {
            case 20:
                this.f26878e = new C1292e(8);
                return;
            default:
                this.f26878e = new LinkedHashMap();
                return;
        }
    }

    public /* synthetic */ C13572e(int i, Object obj, int i2) {
        this.f26880e = i2;
        this.f26879e = i;
        this.f26878e = obj;
    }

    public C13572e(int i, SecureRandom secureRandom) {
        this.f26880e = 11;
        if (secureRandom == null) {
            secureRandom = AbstractC9915e.vip();
        } else {
            ThreadLocal threadLocal = AbstractC9915e.ad;
        }
        this.f26878e = secureRandom;
        this.f26879e = i;
    }

    public C13572e(int i, Ctry ctry) {
        this.f26880e = 12;
        if (ctry == null) {
            throw new NullPointerException("digest == null");
        }
        this.f26878e = AbstractC7171e.ad(ctry);
        this.f26879e = i;
    }

    public /* synthetic */ C13572e(int i, boolean z) {
        this.f26880e = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13572e(Context context) {
        this(context, DialogInterfaceC15370e.adcel(context, 0));
        this.f26880e = 0;
    }

    public C13572e(Context context, int i) {
        this.f26880e = 0;
        this.f26878e = new C11486e(new ContextThemeWrapper(context, DialogInterfaceC15370e.adcel(context, i)));
        this.f26879e = i;
    }

    public C13572e(C11897e c11897e) {
        this.f26880e = 4;
        this.f26878e = c11897e;
        this.f26879e = c11897e.ad + c11897e.vip;
    }

    public C13572e(C14664e c14664e) {
        this.f26880e = 5;
        this.f26878e = c14664e;
        this.f26879e = c14664e.ad;
    }

    public C13572e(C14758e c14758e, int i) {
        this.f26880e = 24;
        AbstractC9528e.startapp(c14758e);
        this.f26878e = c14758e;
        this.f26879e = i;
    }

    public /* synthetic */ C13572e(Object obj, int i, int i2) {
        this.f26880e = i2;
        this.f26878e = obj;
        this.f26879e = i;
    }

    public C13572e(boolean z, boolean z2, boolean z3) {
        this.f26880e = 14;
        this.f26879e = (z || z2 || z3) ? 1 : 0;
    }

    public C13572e(int[] iArr, int i) {
        C15574e c15574e;
        this.f26880e = 22;
        this.f26879e = i;
        if (iArr != null) {
            C15574e c15574e2 = C15574e.f30741e;
            c15574e = iArr.length == 0 ? C15574e.f30741e : new C15574e(Arrays.copyOf(iArr, iArr.length));
        } else {
            c15574e = C15574e.f30741e;
        }
        this.f26878e = c15574e;
    }

    @Override // defpackage.InterfaceC5282e
    public boolean Signature(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // defpackage.InterfaceC18472e
    public boolean ad(View view) {
        ((BottomSheetBehavior) this.f26878e).crashlytics(this.f26879e);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eَؑٓ, java.lang.Object] */
    public byte[] adcel(byte[] bArr, int i, byte[] bArr2) {
        long j = i;
        int i2 = this.f26879e;
        byte[] advert = AbstractC16947e.advert(i2, j);
        ?? r1 = this.f26878e;
        r1.update(advert, 0, advert.length);
        r1.update(bArr, 0, bArr.length);
        r1.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[i2];
        if (r1 instanceof InterfaceC6931e) {
            ((InterfaceC6931e) r1).metrica(0, i2, bArr3);
            return bArr3;
        }
        r1.doFinal(bArr3, 0);
        return bArr3;
    }

    public C9312e admob(byte[] bArr) {
        C11897e c11897e = (C11897e) this.f26878e;
        byte[] copyOf = Arrays.copyOf(bArr, c11897e.ad);
        int i = c11897e.ad;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, c11897e.vip + i);
        C11980e c11980e = new C11980e(2, false);
        c11980e.f23949e = null;
        c11980e.f23951e = null;
        c11980e.f23948e = null;
        c11980e.f23950e = c11897e;
        c11980e.f23949e = new C17974e(23, C15768e.ad(copyOf));
        c11980e.f23951e = new C17974e(23, C15768e.ad(copyOfRange));
        return C9312e.metrica(c11980e.m3305while());
    }

    @Override // defpackage.InterfaceC18515e
    public byte[] advert(byte[] bArr, int i, byte[] bArr2) {
        switch (this.f26880e) {
            case 4:
                if (bArr2.length < i) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return admob(bArr).vip(Arrays.copyOfRange(bArr2, i, bArr2.length), AbstractC15143e.ad);
            default:
                if (bArr2.length < i) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr2, i, bArr2.length);
                C12894e c12894e = new C12894e(4, false);
                c12894e.f25750e = null;
                c12894e.f25752e = null;
                c12894e.f25751e = (C14664e) this.f26878e;
                c12894e.f25750e = new C17974e(23, C15768e.ad(bArr));
                C12892e yandex = c12894e.yandex();
                return new C11805e(((C15768e) yandex.vip.f35233e).vip(), yandex.metrica).vip(copyOfRange, AbstractC15143e.ad);
        }
    }

    public DialogInterfaceC15370e amazon() {
        C11486e c11486e = (C11486e) this.f26878e;
        DialogInterfaceC15370e dialogInterfaceC15370e = new DialogInterfaceC15370e(c11486e.ad, this.f26879e);
        View view = c11486e.appmetrica;
        C3024e c3024e = dialogInterfaceC15370e.f30302e;
        if (view != null) {
            c3024e.isVip = view;
        } else {
            CharSequence charSequence = c11486e.license;
            if (charSequence != null) {
                c3024e.license = charSequence;
                TextView textView = c3024e.signatures;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c11486e.metrica;
            if (drawable != null) {
                c3024e.remoteconfig = drawable;
                ImageView imageView = c3024e.pro;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c3024e.pro.setImageDrawable(drawable);
                }
            }
        }
        String str = c11486e.purchase;
        if (str != null) {
            c3024e.appmetrica = str;
            TextView textView2 = c3024e.tapsense;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = c11486e.billing;
        if (charSequence2 != null) {
            c3024e.metrica(-1, charSequence2, c11486e.yandex);
        }
        CharSequence charSequence3 = c11486e.startapp;
        if (charSequence3 != null) {
            c3024e.metrica(-2, charSequence3, c11486e.adcel);
        }
        CharSequence charSequence4 = c11486e.mopub;
        if (charSequence4 != null) {
            c3024e.metrica(-3, charSequence4, c11486e.advert);
        }
        if (c11486e.amazon != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c11486e.vip.inflate(c3024e.ads, (ViewGroup) null);
            int i = c11486e.admob ? c3024e.premium : c3024e.subs;
            ListAdapter listAdapter = c11486e.amazon;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(c11486e.ad, i, R.id.text1, (Object[]) null);
            }
            c3024e.inmobi = listAdapter;
            c3024e.isPro = c11486e.subscription;
            if (c11486e.loadAd != null) {
                alertController$RecycleListView.setOnItemClickListener(new C14974e(c11486e, c3024e));
            }
            if (c11486e.admob) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c3024e.purchase = alertController$RecycleListView;
        }
        LinearLayout linearLayout = c11486e.Signature;
        if (linearLayout != null) {
            c3024e.billing = linearLayout;
            c3024e.yandex = false;
        }
        dialogInterfaceC15370e.setCancelable(true);
        dialogInterfaceC15370e.setCanceledOnTouchOutside(true);
        dialogInterfaceC15370e.setOnCancelListener(null);
        dialogInterfaceC15370e.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC16291e dialogInterfaceOnKeyListenerC16291e = c11486e.smaato;
        if (dialogInterfaceOnKeyListenerC16291e != null) {
            dialogInterfaceC15370e.setOnKeyListener(dialogInterfaceOnKeyListenerC16291e);
        }
        return dialogInterfaceC15370e;
    }

    public void applovin(List list, List list2) {
        Map map = (Map) this.f26878e;
        int i = this.f26879e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj == null) {
                obj = new LinkedHashSet();
                map.put(str, obj);
            }
            Set set = (Set) obj;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                set.add(new C4218e(str, i, (String) it2.next()));
            }
            set.add(new C4218e(str, i, null));
        }
        Object obj2 = map.get(null);
        if (obj2 == null) {
            obj2 = new LinkedHashSet();
            map.put(null, obj2);
        }
        Set set2 = (Set) obj2;
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            set2.add(new C4218e(null, i, (String) it3.next()));
        }
    }

    @Override // defpackage.InterfaceC17064e
    public C7431e appmetrica(int i) {
        C7431e c7431e = (C7431e) ((SparseArray) this.f26878e).get(i);
        if (c7431e != null) {
            return c7431e;
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i, "Cannot find the wrapper for global view type "));
    }

    @Override // defpackage.InterfaceC14343e
    public ListenableFuture billing(C12053e c12053e) {
        ListenableFuture billing = ((InterfaceC14343e) this.f26878e).billing(c12053e);
        if (billing == null) {
            return null;
        }
        return AbstractC2017e.purchase(billing, new C11399e(3, this), EnumC3320e.f7489e);
    }

    @Override // defpackage.InterfaceC0987e
    public /* synthetic */ ListenableFuture call() {
        return ((C2532e) this.f26878e).m913e(this.f26879e);
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        try {
            return ((C11412e) this.f26878e).doFinal(bArr, 0);
        } catch (C6061e e) {
            throw new IllegalStateException(e.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [eُۢۛ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r3v15, types: [eؕٝۢ] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r4v7, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [eِؒۜ, java.lang.Object] */
    @Override // defpackage.InterfaceC16964e
    public Object get() {
        String string;
        C17338e c17338e = (C17338e) this.f26878e;
        int i = this.f26879e;
        C3511e c3511e = 0;
        c3511e = 0;
        c3511e = 0;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                return new C11802e((InterfaceC10500e) c17338e.license.get());
            case 1:
                return AbstractC6629e.ad();
            case 2:
                return new C16417e((C13738e) c17338e.isVip.get());
            case 3:
                C17526e c17526e = (C17526e) c17338e.ad.f13170e;
                C13572e c13572e = c17338e.tapsense;
                Context ad = c17338e.ad();
                C17280e c17280e = (C17280e) c17338e.purchase.get();
                C11802e c11802e = (C11802e) c17338e.appmetrica.get();
                c17526e.license.getClass();
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    InterfaceC0707e interfaceC0707e = (InterfaceC0707e) c13572e.get();
                    Trace.endSection();
                    String str = "CXCP-Camera2";
                    Map singletonMap = Collections.singletonMap(new C10644e(str), new C3379e(interfaceC0707e));
                    if (singletonMap.containsKey(new C10644e(str))) {
                        return new C13738e("CXCP-Camera2", singletonMap, ad, c17280e, c11802e);
                    }
                    throw new IllegalStateException(("Failed to find " + ((Object) C10644e.ad("CXCP-Camera2")) + " in the list of available CameraPipe backends! Available values are " + singletonMap.keySet()).toString());
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 4:
                C17280e c17280e2 = (C17280e) c17338e.purchase.get();
                C11546e c11546e = (C11546e) c17338e.mopub.get();
                C7520e c7520e = (C7520e) c17338e.amazon.get();
                C15682e c15682e = (C15682e) c17338e.signatures.get();
                C9770e c9770e = new C9770e(6, c17338e);
                c17338e.ad();
                return new C5327e(c17280e2, c11546e, c7520e, c15682e, c9770e);
            case 5:
                C11199e c11199e = c17338e.vip;
                C11802e c11802e2 = (C11802e) c17338e.appmetrica.get();
                InterfaceC10500e interfaceC10500e = (InterfaceC10500e) c17338e.license.get();
                int i4 = c11199e.f22462e;
                ArrayList arrayList = new ArrayList();
                ((C8365e) c11199e.f22467e).getClass();
                ThreadFactory threadFactory = AbstractC9744e.vip;
                ScheduledExecutorService ad2 = AbstractC9744e.ad(new ThreadFactoryC13954e(i4, new ThreadFactoryC6417e(threadFactory, "CXCP-IO-", AbstractC14430e.license(0))), 8);
                arrayList.add(ad2);
                AbstractC3743e purchase = AbstractC18275e.purchase(ad2);
                ScheduledExecutorService ad3 = AbstractC9744e.ad(new ThreadFactoryC13954e(i4, new ThreadFactoryC6417e(threadFactory, "CXCP-BG-", AbstractC14430e.license(0))), c11199e.f22463e);
                arrayList.add(ad3);
                AbstractC3743e purchase2 = AbstractC18275e.purchase(ad3);
                ScheduledExecutorService ad4 = AbstractC9744e.ad(new ThreadFactoryC13954e(c11199e.f22465e, new ThreadFactoryC6417e(threadFactory, "CXCP-", AbstractC14430e.license(0))), c11199e.f22464e);
                arrayList.add(ad4);
                AbstractC3743e purchase3 = AbstractC18275e.purchase(ad4);
                int i5 = 10;
                c11802e2.metrica(3, new RunnableC1352e(i5, arrayList));
                C3428e c3428e = new C3428e(c11199e, c11802e2, i3);
                C3428e c3428e2 = new C3428e(c11199e, c11802e2, i2);
                ?? obj = new Object();
                ?? obj2 = new Object();
                obj.f9318e = AbstractC9743e.ad(AbstractC5797e.vip(new C6799e(interfaceC10500e), purchase3).mo394const(new C5621e("CXCP")));
                obj2.f9318e = AbstractC9743e.ad(AbstractC5797e.vip(new C6799e(interfaceC10500e), new C5621e("CXCP-Dispatch")));
                c11802e2.metrica(2, new RunnableC11247e(obj, obj2, i5));
                return new C17280e((InterfaceC18435e) obj.f9318e, (InterfaceC18435e) obj2.f9318e, purchase, purchase2, ad4, purchase3, c3428e, c3428e2);
            case 6:
                InterfaceC11206e interfaceC11206e = c17338e.billing;
                C17280e c17280e3 = (C17280e) c17338e.purchase.get();
                c17338e.ad();
                return new C11546e(interfaceC11206e, c17280e3, (PackageManager) c17338e.yandex.get(), (C14328e) c17338e.startapp.get(), c17338e.adcel, (C11802e) c17338e.appmetrica.get(), (InterfaceC10500e) c17338e.license.get());
            case 7:
                CameraManager cameraManager = (CameraManager) c17338e.ad().getSystemService("camera");
                AbstractC1513e.appmetrica(cameraManager);
                return cameraManager;
            case 8:
                return c17338e.ad().getPackageManager();
            case 9:
                return new C14328e();
            case 10:
                Context ad5 = c17338e.ad();
                ?? obj3 = new Object();
                if (Build.VERSION.SDK_INT >= 35) {
                    obj3.vip = new C3511e(ad5);
                }
                try {
                    ServiceInfo[] serviceInfoArr = ad5.getPackageManager().getPackageInfo(ad5.getPackageName(), 132).services;
                    if (serviceInfoArr != null) {
                        String str2 = null;
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            Bundle bundle = serviceInfo.metaData;
                            if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str2 != null) {
                                    throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                }
                                str2 = string;
                            }
                        }
                        if (str2 != null) {
                            try {
                                c3511e = (C3511e) Class.forName(str2).getConstructor(Context.class).newInstance(ad5);
                            } catch (Exception e) {
                                throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                obj3.ad = c3511e;
                return obj3;
            case 11:
                Context ad6 = c17338e.ad();
                C17280e c17280e4 = (C17280e) c17338e.purchase.get();
                C1739e c1739e = (C1739e) c17338e.advert.get();
                C17647e c17647e = ((C17526e) c17338e.ad.f13170e).metrica;
                AbstractC1513e.appmetrica(c17647e);
                return new C7520e(ad6, c17280e4, c1739e, c17647e, (C13399e) c17338e.smaato.get());
            case 12:
                return new C1739e(c17338e.ad());
            case 13:
                return new Object();
            case 14:
                return new C15682e((C16760e) c17338e.remoteconfig.get(), (C4893e) c17338e.pro.get(), (C14328e) c17338e.startapp.get(), (C17280e) c17338e.purchase.get());
            case 15:
                InterfaceC11206e interfaceC11206e2 = c17338e.billing;
                C6325e c6325e = c17338e.ad;
                C18540e c18540e = new C18540e(interfaceC11206e2, (C17280e) c17338e.purchase.get(), 9);
                InterfaceC12541e interfaceC12541e = (InterfaceC12541e) c17338e.amazon.get();
                C14328e c14328e = (C14328e) c17338e.startapp.get();
                C5122e c5122e = (C5122e) c17338e.Signature.get();
                C13399e c13399e = (C13399e) c17338e.smaato.get();
                C0034e c0034e = ((C17526e) c6325e.f13170e).appmetrica;
                AbstractC1513e.appmetrica(c0034e);
                C8221e c8221e = new C8221e(c18540e, interfaceC12541e, c14328e, c5122e, c13399e, c0034e, (C17280e) c17338e.purchase.get());
                C14328e c14328e2 = (C14328e) c17338e.startapp.get();
                InterfaceC11206e interfaceC11206e3 = c17338e.billing;
                C17280e c17280e5 = (C17280e) c17338e.purchase.get();
                InterfaceC10500e interfaceC10500e2 = (InterfaceC10500e) c17338e.license.get();
                ?? obj4 = new Object();
                obj4.f23072e = interfaceC11206e3;
                obj4.f23070e = c17280e5;
                obj4.f23069e = interfaceC10500e2;
                obj4.f23071e = AbstractC7535e.metrica(new C1853e((Object) obj4, (InterfaceC5083e) c3511e, 16));
                C13399e c13399e2 = (C13399e) c17338e.smaato.get();
                C1533e c1533e = (C1533e) c17338e.admob.get();
                C9173e c9173e = (C9173e) c17338e.subscription.get();
                C0034e c0034e2 = ((C17526e) c6325e.f13170e).appmetrica;
                AbstractC1513e.appmetrica(c0034e2);
                return new C16760e(c8221e, c14328e2, obj4, c13399e2, c1533e, c9173e, c0034e2, (C17280e) c17338e.purchase.get());
            case 16:
                return new C5122e((InterfaceC12541e) c17338e.amazon.get(), (C12204e) c17338e.loadAd.get());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC1513e.appmetrica(((C17526e) c17338e.ad.f13170e).purchase);
                return new Object();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C1533e((DevicePolicyManager) c17338e.ad().getSystemService("device_policy"));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C9173e((C17280e) c17338e.purchase.get(), (C11802e) c17338e.appmetrica.get(), (InterfaceC10500e) c17338e.license.get());
            case 20:
                return new C4893e((C17280e) c17338e.purchase.get(), (C5122e) c17338e.Signature.get(), (C16760e) c17338e.remoteconfig.get());
            case 21:
                c17338e.ad();
                return new Object();
            case 22:
                return new C13322e();
            case 23:
                return new C1758e();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        return ((C11412e) this.f26878e).ad.getAlgorithmName() + "-KGMAC";
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return this.f26879e / 8;
    }

    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C11494e)) {
            throw new IllegalArgumentException("KGMAC requires ParametersWithIV");
        }
        C11494e c11494e = (C11494e) interfaceC3894e;
        byte[] bArr = c11494e.f23095e;
        ((C11412e) this.f26878e).init(true, new smaato((C14915e) c11494e.f23094e, this.f26879e, bArr, null));
    }

    public void inmobi(C15695e c15695e, InterfaceC4082e interfaceC4082e, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f26878e;
        Object obj = linkedHashMap.get(c15695e);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(c15695e, obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        C3120e c3120e = new C3120e(new WeakReference(interfaceC4082e), map, j);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                C3120e c3120e2 = (C3120e) arrayList.get(i);
                if (j < c3120e2.metrica) {
                    i++;
                } else if (c3120e2.ad.get() == interfaceC4082e) {
                    arrayList.set(i, c3120e);
                } else {
                    arrayList.add(i, c3120e);
                }
            }
        } else {
            arrayList.add(c3120e);
        }
        startapp();
    }

    @Override // defpackage.InterfaceC9483e
    /* renamed from: interface */
    public void mo2225interface(String str) {
        int i;
        loadAd(this.f26879e, str.length() + 2);
        char[] cArr = (char[]) this.f26878e;
        int i2 = this.f26879e;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = AbstractC13517e.vip;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    loadAd(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = AbstractC13517e.vip;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) this.f26878e)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = AbstractC13517e.ad[charAt];
                                loadAd(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.f26878e, i5);
                                int length3 = str2.length() + i5;
                                this.f26879e = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) this.f26878e;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                this.f26879e = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) this.f26878e)[i5] = charAt;
                    }
                    i5 = i;
                }
                loadAd(i5, 1);
                ((char[]) this.f26878e)[i5] = '\"';
                this.f26879e = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        this.f26879e = i4 + 1;
    }

    public DialogInterfaceC15370e isPro() {
        DialogInterfaceC15370e amazon = amazon();
        amazon.show();
        return amazon;
    }

    public void isVip(C7332e c7332e) {
        C7332e c7332e2;
        int i = c7332e.purchase;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = this.f26879e;
        C7332e[] c7332eArr = (C7332e[]) this.f26878e;
        C7332e c7332e3 = c7332eArr[i2];
        c7332e.purchase = -1;
        c7332eArr[i2] = null;
        this.f26879e = i2 - 1;
        if (c7332e == c7332e3) {
            return;
        }
        int startapp = AbstractC7890e.startapp(0L, c7332e3.billing - c7332e.billing);
        if (startapp == 0) {
            ((C7332e[]) this.f26878e)[i] = c7332e3;
            c7332e3.purchase = i;
            return;
        }
        if (startapp >= 0) {
            signatures(i, c7332e3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.f26879e;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                } else {
                    c7332e2 = ((C7332e[]) this.f26878e)[i3];
                }
            } else {
                C7332e[] c7332eArr2 = (C7332e[]) this.f26878e;
                c7332e2 = c7332eArr2[i3];
                C7332e c7332e4 = c7332eArr2[i4];
                if (AbstractC7890e.startapp(0L, c7332e4.billing - c7332e2.billing) >= 0) {
                    c7332e2 = c7332e4;
                }
            }
            if (AbstractC7890e.startapp(0L, c7332e2.billing - c7332e3.billing) <= 0) {
                break;
            }
            int i6 = c7332e2.purchase;
            c7332e2.purchase = i;
            ((C7332e[]) this.f26878e)[i] = c7332e2;
            i = i6;
        }
        ((C7332e[]) this.f26878e)[i] = c7332e3;
        c7332e3.purchase = i;
    }

    public byte[] license(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f26879e) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return adcel(bArr, 3, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }

    public void loadAd(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f26878e;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f26878e = Arrays.copyOf(cArr, i3);
        }
    }

    @Override // defpackage.InterfaceC18515e
    public byte[] metrica(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i = this.f26880e;
        byte[] bArr5 = AbstractC15143e.ad;
        boolean z = false;
        switch (i) {
            case 4:
                return AbstractC7640e.ad(bArr2, bArr3, admob(bArr).ad(bArr4, bArr5));
            default:
                C12894e c12894e = new C12894e(4, z);
                c12894e.f25750e = null;
                c12894e.f25752e = null;
                c12894e.f25751e = (C14664e) this.f26878e;
                c12894e.f25750e = new C17974e(23, C15768e.ad(bArr));
                C12892e yandex = c12894e.yandex();
                return AbstractC7640e.ad(bArr2, bArr3, new C11805e(((C15768e) yandex.vip.f35233e).vip(), yandex.metrica).ad(bArr4, bArr5));
        }
    }

    @Override // defpackage.InterfaceC18515e
    public int mopub() {
        switch (this.f26880e) {
            case 4:
                return this.f26879e;
            default:
                return this.f26879e;
        }
    }

    public String pro() {
        BundleNativeClass bundleNativeClass = (BundleNativeClass) this.f26878e;
        int i = this.f26879e;
        Object[] objArr = bundleNativeClass.ad;
        if (objArr.length - 1 < i) {
            throw new IllegalStateException(("idx " + i + " size mismatch").toString());
        }
        Object obj = objArr[i];
        if (obj == null) {
            throw new IllegalStateException(("idx " + i + " is empty").toString());
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalStateException(("idx " + i + " type mismatch").toString());
    }

    @Override // defpackage.InterfaceC17064e
    public InterfaceC7429e purchase(C7431e c7431e) {
        return new C11980e(this, c7431e);
    }

    @Override // defpackage.InterfaceC5282e
    public boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        ((C11412e) this.f26878e).license();
    }

    public void signatures(int i, C7332e c7332e) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            C7332e c7332e2 = ((C7332e[]) this.f26878e)[i2];
            if (AbstractC7890e.startapp(0L, c7332e.billing - c7332e2.billing) <= 0) {
                break;
            }
            c7332e2.purchase = i;
            ((C7332e[]) this.f26878e)[i] = c7332e2;
            i = i2;
        }
        ((C7332e[]) this.f26878e)[i] = c7332e;
        c7332e.purchase = i;
    }

    @Override // defpackage.InterfaceC14343e
    public ListenableFuture smaato(byte[] bArr) {
        return AbstractC2017e.purchase(((InterfaceC14343e) this.f26878e).smaato(bArr), new C11399e(3, this), EnumC3320e.f7489e);
    }

    public void startapp() {
        WeakReference weakReference;
        int i = this.f26879e;
        this.f26879e = i + 1;
        if (i >= 10) {
            this.f26879e = 0;
            Iterator it = ((LinkedHashMap) this.f26878e).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    C3120e c3120e = (C3120e) AbstractC13480e.m3604this(arrayList);
                    if (((c3120e == null || (weakReference = c3120e.ad) == null) ? null : (InterfaceC4082e) weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((C3120e) arrayList.get(i4)).ad.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC9483e
    public void subs(char c) {
        loadAd(this.f26879e, 1);
        char[] cArr = (char[]) this.f26878e;
        int i = this.f26879e;
        this.f26879e = i + 1;
        cArr[i] = c;
    }

    @Override // defpackage.InterfaceC5282e
    public int subscription() {
        if (((MediaCodecInfo[]) this.f26878e) == null) {
            this.f26878e = new MediaCodecList(this.f26879e).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f26878e).length;
    }

    public long tapsense(C14446e c14446e) {
        C1292e c1292e = (C1292e) this.f26878e;
        int i = 0;
        c14446e.billing(c1292e.ad, 0, 1, false);
        int i2 = c1292e.ad[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c14446e.billing(c1292e.ad, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (c1292e.ad[i] & 255) + (i5 << 8);
        }
        this.f26879e = i4 + 1 + this.f26879e;
        return i5;
    }

    @Override // defpackage.InterfaceC9483e
    /* renamed from: this */
    public void mo2228this(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        loadAd(this.f26879e, length);
        str.getChars(0, str.length(), (char[]) this.f26878e, this.f26879e);
        this.f26879e += length;
    }

    public String toString() {
        switch (this.f26880e) {
            case 9:
                return new String((char[]) this.f26878e, 0, this.f26879e);
            case 22:
                C15574e c15574e = (C15574e) this.f26878e;
                ArrayList arrayList = new ArrayList(c15574e.f30742e);
                for (int i = 0; i < c15574e.f30742e; i++) {
                    arrayList.add(AbstractC9413e.m2563return(c15574e.vip(i)));
                }
                return "UnsupportedBrands{major=" + AbstractC9413e.m2563return(this.f26879e) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        ((C11412e) this.f26878e).mopub.write(b);
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        ((C11412e) this.f26878e).ad(i, i2, bArr);
    }

    @Override // defpackage.InterfaceC5282e
    public MediaCodecInfo vip(int i) {
        if (((MediaCodecInfo[]) this.f26878e) == null) {
            this.f26878e = new MediaCodecList(this.f26879e).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f26878e)[i];
    }

    @Override // defpackage.InterfaceC9483e
    public void writeLong(long j) {
        mo2228this(String.valueOf(j));
    }

    @Override // defpackage.InterfaceC5282e
    public boolean yandex(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
