package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import io.realm.kotlin.internal.interop.NativePointer;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۧؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17424e implements InterfaceC8808e, InterfaceC9488e, InterfaceC15169e, InterfaceC14567e, InterfaceC13363e, InterfaceC15269e, InterfaceC16256e, InterfaceC14312e, InterfaceC16836e, InterfaceC15288e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C17424e f34139e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C17424e f34140e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f34141e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f34142e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34143e;

    static {
        int i = 1;
        boolean z = false;
        f34140e = new C17424e("dhDefaultParams", C3236e.class, z, i);
        f34139e = new C17424e("dsaDefaultParams", C6818e.class, z, i);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [eٗۥؓ, java.lang.Object, android.hardware.camera2.CameraDevice$StateCallback] */
    public C17424e(int i) {
        this.f34143e = i;
        switch (i) {
            case 4:
                this.f34142e = new Rect();
                this.f34141e = new Rect();
                return;
            case 9:
                ?? stateCallback = new CameraDevice.StateCallback();
                stateCallback.ad = AbstractC14430e.appmetrica(C13664e.f27089e);
                this.f34142e = stateCallback;
                this.f34141e = new C13391e(11);
                return;
            case 15:
                this.f34142e = new C1756e(0);
                this.f34141e = new C1756e(0);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE);
                this.f34142e = byteArrayOutputStream;
                this.f34141e = new DataOutputStream(byteArrayOutputStream);
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                this.f34142e = new Object();
                this.f34141e = new ArrayList();
                return;
            default:
                C6594e c6594e = new C6594e(4, false);
                c6594e.f13613e = new ArrayList();
                this.f34142e = c6594e;
                this.f34141e = new C14391e(900.0f, 1.0f);
                return;
        }
    }

    public C17424e(int i, int i2) {
        this.f34143e = 23;
        this.f34142e = new int[]{i, i2};
        this.f34141e = new float[]{0.0f, 1.0f};
    }

    public C17424e(int i, int i2, int i3) {
        this.f34143e = 23;
        this.f34142e = new int[]{i, i2, i3};
        this.f34141e = new float[]{0.0f, 0.5f, 1.0f};
    }

    public /* synthetic */ C17424e(int i, boolean z) {
        this.f34143e = i;
    }

    public C17424e(Animator animator) {
        this.f34143e = 21;
        this.f34142e = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34141e = animatorSet;
        animatorSet.play(animator);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17424e(Context context) {
        this(context, new C10629e(4));
        this.f34143e = 13;
    }

    public C17424e(Context context, InterfaceC15169e interfaceC15169e) {
        this.f34143e = 13;
        this.f34142e = context.getApplicationContext();
        this.f34141e = interfaceC15169e;
    }

    public C17424e(Animation animation) {
        this.f34143e = 21;
        this.f34142e = animation;
        this.f34141e = null;
    }

    public C17424e(InterfaceC15288e interfaceC15288e) {
        this.f34143e = 29;
        this.f34142e = interfaceC15288e;
        this.f34141e = (NativePointer) AbstractC5336e.yandex(C2693e.f6576e, new C16600e(this, null, 18));
    }

    public C17424e(C17075e c17075e) {
        this.f34143e = 14;
        this.f34141e = c17075e;
    }

    public /* synthetic */ C17424e(Object obj, Object obj2, int i) {
        this.f34143e = i;
        this.f34141e = obj;
        this.f34142e = obj2;
    }

    public /* synthetic */ C17424e(Object obj, Object obj2, boolean z, int i) {
        this.f34143e = i;
        this.f34142e = obj;
        this.f34141e = obj2;
    }

    public C17424e(ArrayList arrayList, ArrayList arrayList2) {
        this.f34143e = 23;
        int size = arrayList.size();
        this.f34142e = new int[size];
        this.f34141e = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f34142e)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f34141e)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C17424e(List list, Map map) {
        this.f34143e = 27;
        this.f34142e = list;
        this.f34141e = map;
        if (((AtomicBoolean) AbstractC7062e.ad.f15896e).get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C3611e c3611e = (C3611e) it.next();
                int i = c3611e.license;
                if (hashSet.contains(Integer.valueOf(i))) {
                    throw new GeneralSecurityException(AbstractC1634e.smaato("KeyID ", i, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(i));
                if (c3611e.appmetrica) {
                    z = true;
                }
            }
            if (!z) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    public static C17424e admob(C7818e c7818e) {
        return new C17424e(c7818e, AbstractC6336e.metrica(c7818e.firebase()), 0);
    }

    public static void amazon(C3599e c3599e) {
        for (C17915e c17915e : c3599e.crashlytics()) {
            if (c17915e.crashlytics().crashlytics() == EnumC13541e.UNKNOWN_KEYMATERIAL || c17915e.crashlytics().crashlytics() == EnumC13541e.SYMMETRIC || c17915e.crashlytics().crashlytics() == EnumC13541e.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(AbstractC17861e.admob("keyset contains key material of type ", c17915e.crashlytics().crashlytics().name(), " for type url ", c17915e.crashlytics().firebase()));
            }
        }
    }

    /* renamed from: class, reason: not valid java name */
    public static boolean m4314class(EnumC4513e enumC4513e) {
        int ordinal = enumC4513e.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3;
    }

    /* renamed from: extends, reason: not valid java name */
    public static AbstractC14783e m4315extends(C17915e c17915e) {
        C12524e m4316throw = m4316throw(c17915e);
        C15619e c15619e = C15619e.vip;
        C6150e c6150e = (C6150e) c15619e.ad.get();
        c6150e.getClass();
        return !c6150e.vip.containsKey(new C10567e(C12524e.class, m4316throw.f25074e)) ? new C0251e(m4316throw) : c15619e.ad(m4316throw);
    }

    public static final C17424e inmobi(AbstractC12699e abstractC12699e) {
        int i;
        EnumC4513e enumC4513e;
        C12309e c12309e = new C12309e(12);
        ArrayList arrayList = (ArrayList) c12309e.f24693e;
        C14379e c14379e = new C14379e(abstractC12699e);
        C5170e c5170e = C5170e.f11074e;
        c14379e.metrica = c5170e;
        c14379e.ad = true;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C14379e) it.next()).ad = false;
        }
        arrayList.add(c14379e);
        if (c12309e.f24694e) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        c12309e.f24694e = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
            if (((C14379e) arrayList.get(i2)).metrica == c5170e && ((C14379e) arrayList.get(i2 + 1)).metrica != c5170e) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        Integer num = null;
        while (it2.hasNext()) {
            C14379e c14379e2 = (C14379e) it2.next();
            c14379e2.getClass();
            AbstractC12699e abstractC12699e2 = c14379e2.vip;
            C5170e c5170e2 = c14379e2.metrica;
            if (c5170e2 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (c5170e2 == c5170e) {
                int i3 = 0;
                while (true) {
                    if (i3 != 0 && !hashSet.contains(Integer.valueOf(i3))) {
                        break;
                    }
                    Charset charset = AbstractC6336e.ad;
                    i3 = 0;
                    while (i3 == 0) {
                        byte[] ad = AbstractC10461e.ad(4);
                        i3 = (ad[3] & 255) | ((ad[0] & 255) << 24) | ((ad[1] & 255) << 16) | ((ad[2] & 255) << 8);
                    }
                }
                i = i3;
            } else {
                i = 0;
            }
            if (hashSet.contains(Integer.valueOf(i))) {
                throw new GeneralSecurityException(AbstractC1634e.smaato("Id ", i, " is used twice in the keyset"));
            }
            hashSet.add(Integer.valueOf(i));
            AbstractC14783e vip = C1825e.vip.vip(abstractC12699e2, abstractC12699e2.ad() ? Integer.valueOf(i) : null);
            Object obj = C7364e.f15095e;
            if (obj.equals(obj)) {
                enumC4513e = EnumC4513e.ENABLED;
            } else if (C7364e.f15096e.equals(obj)) {
                enumC4513e = EnumC4513e.DISABLED;
            } else {
                if (!C7364e.f15094e.equals(obj)) {
                    throw new IllegalStateException("Unknown key status");
                }
                enumC4513e = EnumC4513e.DESTROYED;
            }
            C3611e c3611e = new C3611e(vip, enumC4513e, i, c14379e2.ad, false);
            if (c14379e2.ad) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = Integer.valueOf(i);
            }
            arrayList2.add(c3611e);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        C17424e c17424e = new C17424e(arrayList2, (HashMap) c12309e.f24695e);
        c17424e.isPro();
        return c17424e;
    }

    public static final C17424e isVip(C3599e c3599e) {
        AbstractC14783e c0251e;
        boolean z;
        boolean z2;
        EnumC4513e enumC4513e;
        AbstractC14783e abstractC14783e;
        if (c3599e.subs() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(c3599e.subs());
        for (C17915e c17915e : c3599e.crashlytics()) {
            int firebase = c17915e.firebase();
            try {
                c0251e = m4315extends(c17915e);
                z = false;
            } catch (GeneralSecurityException e) {
                if (((AtomicBoolean) AbstractC7062e.ad.f15896e).get()) {
                    throw e;
                }
                c0251e = new C0251e(m4316throw(c17915e));
                z = true;
            }
            if (((AtomicBoolean) AbstractC7062e.ad.f15896e).get() && !m4314class(c17915e.m4470interface())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            EnumC4513e m4470interface = c17915e.m4470interface();
            if (firebase == c3599e.firebase()) {
                z2 = true;
                abstractC14783e = c0251e;
                enumC4513e = m4470interface;
            } else {
                z2 = false;
                enumC4513e = m4470interface;
                abstractC14783e = c0251e;
            }
            arrayList.add(new C3611e(abstractC14783e, enumC4513e, firebase, z2, z));
        }
        return new C17424e(DesugarCollections.unmodifiableList(arrayList), new HashMap());
    }

    public static C17915e pro(AbstractC14783e abstractC14783e, EnumC4513e enumC4513e, int i) {
        C12524e c12524e = (C12524e) C15619e.vip.billing(abstractC14783e);
        Integer vip = abstractC14783e.vip();
        if (vip != null && vip.intValue() != i) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        C16111e m4467this = C17915e.m4467this();
        C15336e m2518interface = C9076e.m2518interface();
        String str = c12524e.f25076e;
        m2518interface.appmetrica();
        C9076e.applovin((C9076e) m2518interface.f9709e, str);
        AbstractC10498e abstractC10498e = c12524e.f25073e;
        m2518interface.appmetrica();
        C9076e.ads((C9076e) m2518interface.f9709e, abstractC10498e);
        EnumC13541e enumC13541e = c12524e.f25075e;
        m2518interface.appmetrica();
        C9076e.premium((C9076e) m2518interface.f9709e, enumC13541e);
        m4467this.appmetrica();
        C17915e.applovin((C17915e) m4467this.f9709e, (C9076e) m2518interface.ad());
        m4467this.appmetrica();
        C17915e.premium((C17915e) m4467this.f9709e, enumC4513e);
        m4467this.appmetrica();
        C17915e.subs((C17915e) m4467this.f9709e, i);
        EnumC3021e enumC3021e = c12524e.f25072e;
        m4467this.appmetrica();
        C17915e.ads((C17915e) m4467this.f9709e, enumC3021e);
        return (C17915e) m4467this.ad();
    }

    /* renamed from: throw, reason: not valid java name */
    public static C12524e m4316throw(C17915e c17915e) {
        return C12524e.ad(c17915e.crashlytics().firebase(), c17915e.crashlytics().m2519class(), c17915e.crashlytics().crashlytics(), c17915e.m4468class(), c17915e.m4468class() == EnumC3021e.RAW ? null : Integer.valueOf(c17915e.firebase()));
    }

    public C5720e Signature() {
        return new C5720e(DesugarCollections.unmodifiableMap((HashMap) this.f34142e), DesugarCollections.unmodifiableMap((HashMap) this.f34141e));
    }

    @Override // defpackage.InterfaceC16836e
    public boolean ad(C18070e c18070e) {
        C5017e premium = premium();
        C11844e c11844e = premium != null ? premium.purchase : null;
        if (c11844e == null || c11844e.metrica()) {
            return true;
        }
        AbstractC13717e adcel = AbstractC12640e.adcel();
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        try {
            return c11844e.appmetrica(c18070e);
        } catch (Throwable th) {
            try {
                premium.getClass();
                throw th;
            } finally {
                AbstractC12640e.Signature(adcel, smaato, appmetrica);
            }
        }
    }

    @Override // defpackage.InterfaceC16836e
    public boolean adcel() {
        C11844e c11844e;
        C5017e premium = premium();
        if (premium == null || (c11844e = premium.purchase) == null) {
            return true;
        }
        return c11844e.metrica();
    }

    public C3599e ads() {
        try {
            C18074e m1380class = C3599e.m1380class();
            for (C3611e c3611e : (List) this.f34142e) {
                AbstractC14783e ad = c3611e.ad();
                int i = c3611e.license;
                C17915e pro = pro(ad, c3611e.vip, i);
                m1380class.appmetrica();
                C3599e.ads((C3599e) m1380class.f9709e, pro);
                if (c3611e.appmetrica) {
                    m1380class.appmetrica();
                    C3599e.applovin((C3599e) m1380class.f9709e, i);
                }
            }
            return (C3599e) m1380class.ad();
        } catch (GeneralSecurityException e) {
            throw new C14803e(e, 14);
        }
    }

    public void advert(Enum r2, Object obj) {
        ((HashMap) this.f34142e).put(r2, obj);
        ((HashMap) this.f34141e).put(obj, r2);
    }

    public C3611e applovin(int i) {
        List list = (List) this.f34142e;
        if (i < 0 || i >= list.size()) {
            StringBuilder premium = AbstractC4653e.premium("Invalid index ", i, " for keyset of size ");
            premium.append(list.size());
            throw new IndexOutOfBoundsException(premium.toString());
        }
        C3611e c3611e = (C3611e) list.get(i);
        if (!m4314class(c3611e.vip)) {
            throw new IllegalStateException(AbstractC1634e.smaato("Keyset-Entry at position ", i, " has wrong status"));
        }
        if (c3611e.purchase) {
            throw new IllegalStateException(AbstractC1634e.smaato("Keyset-Entry at position ", i, " didn't parse correctly"));
        }
        return (C3611e) list.get(i);
    }

    @Override // defpackage.InterfaceC16836e
    public InterfaceC16638e apply() {
        C10014e c10014e = (C10014e) this.f34142e;
        C5017e premium = premium();
        if (premium != null) {
            c10014e.license(premium, false);
        }
        return c10014e.purchase(this.f34141e);
    }

    @Override // defpackage.InterfaceC14567e
    public Object appmetrica() {
        return (C9182e) this.f34142e;
    }

    @Override // defpackage.InterfaceC13363e
    public int billing() {
        return ((ExtendedFloatingActionButton) this.f34141e).f874e;
    }

    @Override // defpackage.InterfaceC16836e
    public void cancel() {
        C5017e premium = premium();
        if ((premium != null ? premium.purchase : null) != null) {
            C10014e.metrica((C10014e) this.f34142e, this.f34141e);
        }
    }

    @Override // defpackage.InterfaceC15288e
    public void close() {
        ((NativePointer) this.f34141e).release();
        ((InterfaceC15288e) this.f34142e).close();
    }

    public Object crashlytics(Class cls) {
        List list = (List) this.f34142e;
        C3599e ads = ads();
        int i = AbstractC4200e.ad;
        int firebase = ads.firebase();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (C17915e c17915e : ads.crashlytics()) {
            if (c17915e.m4470interface() == EnumC4513e.ENABLED) {
                if (!c17915e.m4469goto()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c17915e.firebase())));
                }
                if (c17915e.m4468class() == EnumC3021e.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c17915e.firebase())));
                }
                if (c17915e.m4470interface() == EnumC4513e.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c17915e.firebase())));
                }
                if (c17915e.firebase() == firebase) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (c17915e.crashlytics().crashlytics() != EnumC13541e.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((C3611e) list.get(i3)).purchase || !m4314class(((C3611e) list.get(i3)).vip)) {
                C17915e premium = ads.premium(i3);
                StringBuilder premium2 = AbstractC4653e.premium("Key parsing of key with index ", i3, " and type_url ");
                premium2.append(premium.crashlytics().firebase());
                premium2.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(premium2.toString());
            }
        }
        C17919e c17919e = (C17919e) C17895e.vip.ad.get();
        HashMap hashMap = c17919e.vip;
        if (!hashMap.containsKey(cls)) {
            throw new GeneralSecurityException(AbstractC0054e.subs(cls, "No wrapper found for "));
        }
        InterfaceC17259e interfaceC17259e = (InterfaceC17259e) hashMap.get(cls);
        return interfaceC17259e.metrica(this, new C18070e(c17919e, interfaceC17259e, 21));
    }

    public C17424e firebase() {
        AbstractC14783e c0251e;
        boolean z;
        C3611e c3611e;
        C3599e ads = ads();
        List<C3611e> list = (List) this.f34142e;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (C3611e c3611e2 : list) {
            AbstractC14783e ad = c3611e2.ad();
            EnumC4513e enumC4513e = c3611e2.vip;
            if (ad instanceof AbstractC15702e) {
                AbstractC14783e smaato = ((AbstractC15702e) c3611e2.ad()).smaato();
                c3611e = new C3611e(smaato, enumC4513e, c3611e2.license, c3611e2.appmetrica, false);
                int i2 = c3611e2.license;
                Integer vip = smaato.vip();
                if (vip != null && vip.intValue() != i2) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
            } else {
                C17915e premium = ads.premium(i);
                C9076e crashlytics = premium.crashlytics();
                if (crashlytics.crashlytics() != EnumC13541e.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
                String firebase = crashlytics.firebase();
                AbstractC10498e m2519class = crashlytics.m2519class();
                int i3 = AbstractC6373e.ad;
                InterfaceC7024e vip2 = C11731e.license.vip(firebase);
                if (!(vip2 instanceof C3710e)) {
                    throw new GeneralSecurityException(AbstractC5087e.m1746extends("manager for key type ", firebase, " is not a PrivateKeyManager"));
                }
                C3710e c3710e = (C3710e) vip2;
                C12524e ad2 = C12524e.ad(c3710e.ad, m2519class, c3710e.metrica, EnumC3021e.RAW, null);
                C15619e c15619e = C15619e.vip;
                AbstractC14783e ad3 = c15619e.ad(ad2);
                if (!(ad3 instanceof AbstractC15702e)) {
                    throw new GeneralSecurityException("Key not private key");
                }
                C12524e c12524e = (C12524e) c15619e.billing(((AbstractC15702e) ad3).smaato());
                C15336e m2518interface = C9076e.m2518interface();
                String str = c12524e.f25076e;
                m2518interface.appmetrica();
                C9076e.applovin((C9076e) m2518interface.f9709e, str);
                AbstractC10498e abstractC10498e = c12524e.f25073e;
                m2518interface.appmetrica();
                C9076e.ads((C9076e) m2518interface.f9709e, abstractC10498e);
                EnumC13541e enumC13541e = c12524e.f25075e;
                m2518interface.appmetrica();
                C9076e.premium((C9076e) m2518interface.f9709e, enumC13541e);
                C9076e c9076e = (C9076e) m2518interface.ad();
                C16111e c16111e = (C16111e) premium.inmobi();
                c16111e.appmetrica();
                C17915e.applovin((C17915e) c16111e.f9709e, c9076e);
                C17915e c17915e = (C17915e) c16111e.ad();
                try {
                    c0251e = m4315extends(c17915e);
                    z = false;
                } catch (GeneralSecurityException e) {
                    if (((AtomicBoolean) AbstractC7062e.ad.f15896e).get()) {
                        throw e;
                    }
                    c0251e = new C0251e(m4316throw(c17915e));
                    z = true;
                }
                AbstractC14783e abstractC14783e = c0251e;
                int firebase2 = c17915e.firebase();
                c3611e = new C3611e(abstractC14783e, enumC4513e, firebase2, firebase2 == ads.firebase(), z);
            }
            arrayList.add(c3611e);
            i++;
        }
        C17424e c17424e = new C17424e(arrayList, (Map) this.f34141e);
        c17424e.isPro();
        return c17424e;
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        Context context = (Context) ((C15816e) this.f34142e).f31190e;
        InterfaceC8850e interfaceC8850e = (InterfaceC8850e) ((InterfaceC16964e) this.f34141e).get();
        return C15796e.ad(C10990e.f21755e, new C17974e(22, new C2163e(27)), AbstractC9743e.ad(interfaceC8850e), new C14648e(context, 1));
    }

    @Override // defpackage.InterfaceC16256e
    public BigInteger getOrder() {
        return ((C3297e) ((AbstractC0821e) this.f34142e).f3209e).f7457e;
    }

    @Override // defpackage.InterfaceC13363e
    public int getWidth() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C2362e c2362e = (C2362e) this.f34142e;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f34141e;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return c2362e.getWidth();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return c2362e.getWidth();
    }

    @Override // defpackage.InterfaceC13363e
    /* renamed from: goto */
    public ViewGroup.LayoutParams mo817goto() {
        int i = ((ExtendedFloatingActionButton) this.f34141e).f878e;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }

    @Override // defpackage.InterfaceC16256e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        SecureRandom secureRandom = null;
        if (z) {
            if (interfaceC3894e instanceof C12219e) {
                C12219e c12219e = (C12219e) interfaceC3894e;
                secureRandom = c12219e.f24538e;
                interfaceC3894e = c12219e.f24537e;
            }
            this.f34142e = (C13537e) interfaceC3894e;
            if (secureRandom == null) {
                secureRandom = AbstractC9915e.vip();
            } else {
                ThreadLocal threadLocal = AbstractC9915e.ad;
            }
        } else {
            this.f34142e = (C17901e) interfaceC3894e;
        }
        this.f34141e = secureRandom;
        AbstractC0259e.vip(((C3297e) ((AbstractC0821e) this.f34142e).f3209e).f7458e);
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    /* renamed from: interface, reason: not valid java name */
    public void m4317interface(C14836e c14836e) {
        ExecutorC6131e executorC6131e = (ExecutorC6131e) this.f34141e;
        C0731e c0731e = (C0731e) this.f34142e;
        int i = c14836e.vip;
        if (i == 0) {
            executorC6131e.execute(new RunnableC17144e(c0731e, c14836e.ad, 6));
        } else {
            executorC6131e.execute(new RunnableC9280e(c0731e, i, 0));
        }
    }

    public void isPro() {
        if (((Map) this.f34141e).get(AbstractC2564e.class) != null) {
            throw new ClassCastException();
        }
    }

    @Override // defpackage.InterfaceC14312e
    public void license(int i, AbstractC5113e abstractC5113e, C12701e c12701e) {
        synchronized (this.f34142e) {
            ((ArrayList) this.f34141e).add(new C13275e(i, abstractC5113e, c12701e));
        }
    }

    public C14664e loadAd() {
        Integer num = (Integer) this.f34142e;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((C8776e) this.f34141e) != null) {
            return new C14664e(num.intValue(), (C8776e) this.f34141e);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    @Override // defpackage.InterfaceC14312e
    public void metrica() {
        synchronized (this.f34142e) {
            try {
                Iterator it = ((ArrayList) this.f34141e).iterator();
                while (it.hasNext()) {
                    C13275e c13275e = (C13275e) it.next();
                    c13275e.metrica.license(c13275e.ad, null);
                    c13275e.vip.ad();
                }
                ((ArrayList) this.f34141e).clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC16256e
    public boolean mopub(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        BigInteger bigInteger3 = new BigInteger(1, AbstractC12442e.subs(bArr));
        C3297e c3297e = (C3297e) ((AbstractC0821e) this.f34142e).f3209e;
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0) {
            return false;
        }
        BigInteger bigInteger4 = c3297e.f7457e;
        BigInteger bigInteger5 = c3297e.f7458e;
        if (bigInteger4.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || bigInteger4.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger modPow = bigInteger3.modPow(bigInteger4.subtract(new BigInteger("2")), bigInteger4);
        return c3297e.f7456e.modPow(bigInteger2.multiply(modPow).mod(bigInteger4), bigInteger5).multiply(((C17901e) ((AbstractC0821e) this.f34142e)).f35147e.modPow(bigInteger4.subtract(bigInteger).multiply(modPow).mod(bigInteger4), bigInteger5)).mod(bigInteger5).mod(bigInteger4).equals(bigInteger);
    }

    /* renamed from: native, reason: not valid java name */
    public void m4318native(int i) {
        if (i != 32 && i != 48 && i != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
        }
        this.f34142e = Integer.valueOf(i);
    }

    @Override // defpackage.InterfaceC13363e
    /* renamed from: new */
    public int mo820new() {
        return ((ExtendedFloatingActionButton) this.f34141e).f873e;
    }

    public C5017e premium() {
        C10014e c10014e = (C10014e) this.f34142e;
        C13915e c13915e = (C13915e) c10014e.f19772e.billing(this.f34141e);
        if (c13915e != null) {
            return (C5017e) c10014e.f19783e.billing(c13915e);
        }
        return null;
    }

    @Override // defpackage.InterfaceC16256e
    public BigInteger[] purchase(byte[] bArr) {
        BigInteger bigInteger;
        BigInteger metrica;
        BigInteger bigInteger2 = new BigInteger(1, AbstractC12442e.subs(bArr));
        C3297e c3297e = (C3297e) ((AbstractC0821e) this.f34142e).f3209e;
        do {
            bigInteger = c3297e.f7457e;
            metrica = AbstractC5907e.metrica(bigInteger.bitLength(), (SecureRandom) this.f34141e);
        } while (metrica.compareTo(bigInteger) >= 0);
        BigInteger mod = c3297e.f7456e.modPow(metrica, c3297e.f7458e).mod(bigInteger);
        return new BigInteger[]{mod, metrica.multiply(bigInteger2).add(((C13537e) ((AbstractC0821e) this.f34142e)).f26831e.multiply(mod)).mod(bigInteger)};
    }

    @Override // defpackage.InterfaceC15169e
    public InterfaceC9660e remoteconfig() {
        return new C1300e((Context) this.f34142e, ((InterfaceC15169e) this.f34141e).remoteconfig());
    }

    public void signatures(C11387e c11387e) {
        synchronized (c11387e) {
        }
        Handler handler = (Handler) this.f34142e;
        if (handler != null) {
            handler.post(new RunnableC8041e(this, c11387e, 0));
        }
    }

    @Override // defpackage.InterfaceC15288e
    public AbstractC3743e smaato() {
        return ((InterfaceC15288e) this.f34142e).smaato();
    }

    @Override // defpackage.InterfaceC14312e
    public void startapp(AbstractC5113e abstractC5113e) {
        synchronized (this.f34142e) {
            Iterator it = ((ArrayList) this.f34141e).iterator();
            while (it.hasNext()) {
                if (AbstractC7890e.billing(((C13275e) it.next()).vip, abstractC5113e)) {
                    abstractC5113e.ad();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public C3611e subs() {
        for (C3611e c3611e : (List) this.f34142e) {
            if (c3611e != null && c3611e.appmetrica) {
                if (c3611e.metrica == C7364e.f15095e) {
                    return c3611e;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public void subscription() {
        String str = (String) this.f34142e;
        try {
            C14461e c14461e = (C14461e) this.f34141e;
            c14461e.getClass();
            new File((File) c14461e.f28586e, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList tapsense() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        C0444e c0444e = (C0444e) this.f34141e;
        Context context = (Context) this.f34142e;
        Class cls = (Class) c0444e.f2491e;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C10175e(0, (String) it.next()));
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0082. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00c9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:19:0x0062, B:28:0x0209, B:29:0x0074, B:30:0x0082, B:33:0x0087, B:41:0x0097, B:44:0x00b1, B:47:0x00a0, B:51:0x00a9, B:54:0x00bf, B:57:0x00ce, B:59:0x00d6, B:62:0x00e0, B:66:0x0109, B:69:0x0110, B:70:0x0128, B:72:0x00e9, B:74:0x00f1, B:77:0x00ff, B:80:0x0129, B:82:0x0131, B:85:0x013f, B:88:0x0149, B:91:0x0154, B:92:0x016c, B:94:0x016d, B:97:0x0177, B:100:0x0182, B:101:0x019a, B:103:0x019b, B:105:0x01a3, B:108:0x01ac, B:111:0x01b6, B:114:0x01c0, B:115:0x01d8, B:117:0x01d9, B:120:0x01e3, B:123:0x01ed, B:124:0x0205, B:127:0x0206), top: B:18:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[SYNTHETIC] */
    /* renamed from: this, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4319this(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17424e.m4319this(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public String toString() {
        switch (this.f34143e) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return AbstractC4200e.ad(ads()).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC13363e
    public int vip() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ((C2362e) this.f34142e).f5914e;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.f34141e;
        int i = extendedFloatingActionButton2.f878e;
        if (i != -1) {
            return (i == 0 || i == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // defpackage.InterfaceC14567e
    public boolean yandex(CharSequence charSequence, int i, int i2, C17115e c17115e) {
        if ((c17115e.metrica & 4) > 0) {
            return true;
        }
        if (((C9182e) this.f34142e) == null) {
            this.f34142e = new C9182e(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C5438e) this.f34141e).getClass();
        ((C9182e) this.f34142e).setSpan(new C2205e(c17115e), i, i2, 33);
        return true;
    }
}
