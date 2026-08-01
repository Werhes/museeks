package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.view.View;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;

/* renamed from: package, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class Cpackage implements InterfaceC13969e, InterfaceC15633e, InterfaceC16843e, InterfaceC10941e, InterfaceC2789e, InterfaceC2484e, InterfaceC17023e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f36443e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36444e;

    public Cpackage(int i) {
        this.f36444e = i;
        switch (i) {
            case 5:
                this.f36443e = new C11501e();
                return;
            case 6:
                this.f36443e = new Object();
                return;
            case 10:
                this.f36443e = new HashMap();
                return;
            case 11:
                C3123e c3123e = AbstractC12146e.ad;
                this.f36443e = new C3123e();
                return;
            case 12:
                this.f36443e = AbstractC11854e.vip;
                return;
            case 14:
                this.f36443e = new C0895e();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.f36443e = new ConcurrentHashMap();
                return;
            default:
                C6351e c6351e = new C6351e();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c6351e.isVip = AbstractC16286e.vip(0L, timeUnit);
                c6351e.inmobi = AbstractC16286e.vip(0L, timeUnit);
                c6351e.applovin = AbstractC16286e.vip(0L, timeUnit);
                c6351e.isPro = AbstractC16286e.vip(0L, timeUnit);
                this.f36443e = new C1343e(c6351e);
                return;
        }
    }

    public /* synthetic */ Cpackage(int i, Object obj) {
        this.f36444e = i;
        this.f36443e = obj;
    }

    public /* synthetic */ Cpackage(int i, boolean z) {
        this.f36444e = i;
    }

    public Cpackage(MediaCodecInfo mediaCodecInfo, String str) {
        this.f36444e = 8;
        try {
            this.f36443e = mediaCodecInfo.getCapabilitiesForType(str);
        } catch (RuntimeException e) {
            throw new Exception("Unable to get CodecCapabilities for mime: ".concat(str), e);
        }
    }

    public Cpackage(AbstractC1186e abstractC1186e) {
        this.f36444e = 1;
        if (abstractC1186e != null) {
            this.f36443e = abstractC1186e;
        } else {
            m4613e(0);
            throw null;
        }
    }

    public Cpackage(InterfaceC2460e interfaceC2460e) {
        this.f36444e = 2;
        if (interfaceC2460e != null) {
            this.f36443e = interfaceC2460e;
        } else {
            m4612e(0);
            throw null;
        }
    }

    public Cpackage(C6936e c6936e) {
        this.f36444e = 17;
        AbstractC9528e.startapp(c6936e);
        this.f36443e = c6936e;
    }

    public Cpackage(OutputStream outputStream) {
        this.f36444e = 16;
        EnumC11433e enumC11433e = EnumC11433e.f22984e;
        try {
            this.f36443e = new C15816e(28, new OutputStreamWriter(outputStream, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    /* renamed from: eٍٟٙ, reason: contains not printable characters */
    public static /* synthetic */ void m4612e(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: e٘ؖٞ, reason: contains not printable characters */
    public static /* synthetic */ void m4613e(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: abstract */
    public long mo2061abstract() {
        C17148e c17148e = (C17148e) this;
        AbstractC6690e mo2105e = c17148e.mo2105e();
        if (mo2105e.Signature()) {
            return -9223372036854775807L;
        }
        return AbstractC9413e.m2567switch(mo2105e.smaato(c17148e.mo2115e(), (C11501e) this.f36443e, 0L).smaato);
    }

    @Override // defpackage.InterfaceC13969e, defpackage.InterfaceC1182e
    public AbstractC1186e ad() {
        AbstractC1186e abstractC1186e = (AbstractC1186e) this.f36443e;
        if (abstractC1186e != null) {
            return abstractC1186e;
        }
        m4613e(1);
        throw null;
    }

    @Override // defpackage.InterfaceC16843e
    public void admob(long j) {
        mo4264e(((C17148e) this).mo2115e(), j, false);
    }

    @Override // defpackage.InterfaceC16843e
    public long ads() {
        C11501e c11501e = (C11501e) this.f36443e;
        C17148e c17148e = (C17148e) this;
        AbstractC6690e mo2105e = c17148e.mo2105e();
        if (mo2105e.Signature() || mo2105e.smaato(c17148e.mo2115e(), c11501e, 0L).purchase == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (AbstractC9413e.firebase(c11501e.billing) - c11501e.purchase) - c17148e.mo2075e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: break */
    public int mo2062break() {
        C17148e c17148e = (C17148e) this;
        AbstractC6690e mo2105e = c17148e.mo2105e();
        if (mo2105e.Signature()) {
            return -1;
        }
        int mo2115e = c17148e.mo2115e();
        c17148e.m4251e();
        int i = c17148e.f33631e;
        if (i == 1) {
            i = 0;
        }
        c17148e.m4251e();
        return mo2105e.mopub(mo2115e, i, c17148e.f33630e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: case */
    public void mo2063case() {
        m4621e(6);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: class */
    public void mo2065class(C1962e c1962e, long j) {
        ((C17148e) this).mo2094e(0, j, AbstractC17475e.ads(c1962e));
    }

    @Override // defpackage.InterfaceC2484e
    public void clear() {
        ((Map) this.f36443e).clear();
    }

    @Override // defpackage.InterfaceC2484e
    /* renamed from: const */
    public boolean mo855const() {
        return true;
    }

    @Override // defpackage.InterfaceC2484e
    public boolean contains(String str) {
        return ((Map) this.f36443e).containsKey(str);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: continue */
    public void mo2066continue() {
        C17148e c17148e = (C17148e) this;
        if (c17148e.mo2105e().Signature() || c17148e.applovin()) {
            m4617e();
            return;
        }
        boolean m4619e = m4619e();
        if (mo2081e() && !mo2120e()) {
            if (m4619e) {
                m4621e(7);
                return;
            } else {
                m4617e();
                return;
            }
        }
        if (m4619e) {
            long mo2071e = c17148e.mo2071e();
            c17148e.m4251e();
            if (mo2071e <= c17148e.f33601e) {
                m4621e(7);
                return;
            }
        }
        mo4264e(c17148e.mo2115e(), 0L, false);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: else */
    public void mo2068else(int i) {
        ((C17148e) this).mo2140throws(i, i + 1);
    }

    public boolean equals(Object obj) {
        switch (this.f36444e) {
            case 0:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public List m4614e(String str) {
        Map map = (Map) this.f36443e;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        mo2758e(str);
        map.put(str, arrayList);
        return arrayList;
    }

    /* renamed from: eٕؒۙ */
    public String mo1406e() {
        return null;
    }

    /* renamed from: eٖؒۘ */
    public abstract int mo1396e(String str, String str2, C12642e c12642e);

    @Override // defpackage.InterfaceC17023e
    /* renamed from: eؚؓؓ */
    public Context mo2258e() {
        throw null;
    }

    @Override // defpackage.InterfaceC17023e
    /* renamed from: eٕؓؗ */
    public C17647e mo2259e() {
        throw null;
    }

    /* renamed from: eٕؓۥ */
    public abstract InterfaceC8848e mo760e(int i, int i2, int i3, long j);

    /* renamed from: eٖؓٚ */
    public abstract void mo1407e(C11467e c11467e);

    /* renamed from: eًؔؐ */
    public abstract AbstractC13345e mo3232e();

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object m4615e(Object obj) {
        synchronized (((HashMap) this.f36443e)) {
            try {
                if (((HashMap) this.f36443e).containsKey(obj)) {
                    return ((HashMap) this.f36443e).get(obj);
                }
                Object mo1317e = mo1317e(obj);
                ((HashMap) this.f36443e).put(obj, mo1317e);
                return mo1317e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: eؙؕ */
    public Object mo773e(C0593e c0593e) {
        throw new IllegalStateException("Override provideCustomOfflineResponse first!");
    }

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public Cdefault m4616e(Cstrictfp cstrictfp, boolean z) {
        AbstractC9947e.ad(cstrictfp);
        Cdefault crashlytics = cstrictfp.crashlytics(z, this);
        m4630e(crashlytics);
        return crashlytics;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eِؕٛ */
    public void mo2077e() {
        C17148e c17148e = (C17148e) this;
        c17148e.m4251e();
        m4624e(12, c17148e.f33578e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٌؖۡ */
    public void mo2080e() {
        int mo2100e = mo2100e();
        if (mo2100e == -1) {
            m4617e();
            return;
        }
        C17148e c17148e = (C17148e) this;
        if (mo2100e == c17148e.mo2115e()) {
            mo4264e(c17148e.mo2115e(), -9223372036854775807L, true);
        } else {
            mo4264e(mo2100e, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؖۡٝ */
    public boolean mo2081e() {
        C17148e c17148e = (C17148e) this;
        AbstractC6690e mo2105e = c17148e.mo2105e();
        return !mo2105e.Signature() && mo2105e.smaato(c17148e.mo2115e(), (C11501e) this.f36443e, 0L).ad();
    }

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public void m4617e() {
        ((C17148e) this).m4251e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؗۦۣ */
    public boolean mo3031e() {
        return true;
    }

    /* renamed from: eؘؑۦ */
    public abstract Object mo2431e();

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘؕۥ */
    public boolean mo2083e() {
        return mo2100e() != -1;
    }

    /* renamed from: eؘؖؑ */
    public void mo2758e(String str) {
    }

    /* renamed from: eؘٙؓ */
    public abstract Object mo1317e(Object obj);

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؙؖؗ */
    public int mo2088e() {
        return ((C17148e) this).mo2105e().loadAd();
    }

    /* renamed from: eؙٕۤ, reason: contains not printable characters */
    public void m4618e(InterfaceC4023e interfaceC4023e) {
        interfaceC4023e.mo460e(new C12996e(this, 0));
    }

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean m4619e() {
        return mo2062break() != -1;
    }

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public List m4620e(C14856e c14856e, int i, long j) {
        C3123e c3123e = (C3123e) this.f36443e;
        List list = (List) c3123e.vip(i);
        if (list != null) {
            return list;
        }
        List ad = c14856e.ad(i);
        int size = ad.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((InterfaceC16719e) ad.get(i2)).admob(j));
        }
        c3123e.startapp(i, arrayList);
        return arrayList;
    }

    /* renamed from: eًؕۙ */
    public abstract AbstractC18406e mo774e();

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eًًؓ */
    public void mo2092e(int i) {
        mo4264e(i, -9223372036854775807L, false);
    }

    /* renamed from: eًۛٝ */
    public boolean mo2058e() {
        return !(this instanceof C10638e);
    }

    /* renamed from: eٌٍٚ */
    public Cdefault mo4593e(Ccatch ccatch) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٌؙٞ */
    public void mo2093e() {
        C17148e c17148e = (C17148e) this;
        c17148e.m4251e();
        m4624e(11, -c17148e.f33584e);
    }

    @Override // defpackage.InterfaceC10941e
    /* renamed from: eٌۡٔ */
    public int mo2359e(String str, String str2) {
        return mo1396e(str, str2, (C12642e) this.f36443e);
    }

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public void m4621e(int i) {
        int mo2062break = mo2062break();
        if (mo2062break == -1) {
            m4617e();
            return;
        }
        C17148e c17148e = (C17148e) this;
        if (mo2062break == c17148e.mo2115e()) {
            mo4264e(c17148e.mo2115e(), -9223372036854775807L, true);
        } else {
            mo4264e(mo2062break, -9223372036854775807L, false);
        }
    }

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public void m4622e(String str, String str2) {
        mo2760e(str2);
        List m4614e = m4614e(str);
        m4614e.clear();
        m4614e.add(str2);
    }

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public String m4623e(String str) {
        List mo856e = mo856e(str);
        if (mo856e != null) {
            return (String) AbstractC13480e.m3604this(mo856e);
        }
        return null;
    }

    @Override // defpackage.InterfaceC2484e
    /* renamed from: eٍۢؒ */
    public List mo856e(String str) {
        return (List) ((Map) this.f36443e).get(str);
    }

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public void m4624e(int i, long j) {
        C17148e c17148e = (C17148e) this;
        long mo2071e = c17148e.mo2071e() + j;
        long duration = c17148e.getDuration();
        if (duration != -9223372036854775807L) {
            mo2071e = Math.min(mo2071e, duration);
        }
        mo4264e(c17148e.mo2115e(), Math.max(mo2071e, 0L), false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eۦؕ, java.lang.Object] */
    /* renamed from: eَٕٞ */
    public AbstractC18491e mo2059e() {
        return new Object();
    }

    /* renamed from: eَۦۥ */
    public void mo2760e(String str) {
    }

    /* renamed from: eُِٔ */
    public void mo2250e() {
        C6915e c6915e = ((C6936e) this.f36443e).f14226e;
        C6936e.yandex(c6915e);
        c6915e.mo2250e();
    }

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public Object m4625e(String str, File file, InterfaceC4097e interfaceC4097e, AbstractC10731e abstractC10731e) {
        C14133e c14133e;
        String uuid = UUID.randomUUID().toString();
        C0193e c0193e = new C0193e(uuid.getBytes(AbstractC5508e.ad));
        c0193e.f1410e = uuid;
        C14133e c14133e2 = C1402e.purchase;
        ArrayList arrayList = new ArrayList();
        C14133e c14133e3 = C1402e.purchase;
        if (!c14133e3.vip.equals("multipart")) {
            throw new IllegalArgumentException(("multipart != " + c14133e3).toString());
        }
        String name = file.getName();
        C10445e c10445e = C14133e.license;
        InterfaceC5083e interfaceC5083e = null;
        try {
            c14133e = AbstractC1266e.vip(AbstractC5304e.m1876synchronized('.', file.getName(), BuildConfig.FLAVOR));
        } catch (IllegalArgumentException unused) {
            c14133e = null;
        }
        C12190e c12190e = new C12190e(new C12190e(c14133e, file, 1), interfaceC4097e, 0);
        StringBuilder inmobi = AbstractC8703e.inmobi("form-data; name=");
        C14133e c14133e4 = C1402e.purchase;
        AbstractC16377e.metrica("file", inmobi);
        if (name != null) {
            inmobi.append("; filename=");
            AbstractC16377e.metrica(name, inmobi);
        }
        String sb = inmobi.toString();
        ArrayList arrayList2 = new ArrayList(20);
        AbstractC3149e.appmetrica("Content-Disposition");
        arrayList2.add("Content-Disposition");
        arrayList2.add(AbstractC5304e.m1855const(sb).toString());
        C15793e c15793e = new C15793e((String[]) arrayList2.toArray(new String[0]));
        if (c15793e.appmetrica("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c15793e.appmetrica("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        arrayList.add(new C8295e(c15793e, c12190e));
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        C1402e c1402e = new C1402e(c0193e, c14133e3, AbstractC16286e.adcel(arrayList));
        C18464e c18464e = new C18464e(23);
        C5363e c5363e = C0308e.appmetrica;
        ((C15783e) c18464e.f36192e).adcel("User-Agent", AbstractC18271e.metrica().license.pro());
        c18464e.m4486e(str);
        c18464e.m4494e("POST", c1402e);
        C8650e c8650e = new C8650e(c18464e);
        C15420e c15420e = AbstractC6731e.ad;
        return AbstractC5336e.advert(ExecutorC3603e.f8134e, new C4870e(this, c8650e, interfaceC5083e, 3), abstractC10731e);
    }

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean m4626e() {
        int i;
        C14635e c14635e = (C14635e) this.f36443e;
        View view = c14635e.metrica.f35098e;
        if (view != null) {
            i = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(AbstractC1786e.admob(visibility, "Unknown visibility "));
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        int i2 = c14635e.ad;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }

    @Override // defpackage.InterfaceC2484e
    /* renamed from: eُۘٙ */
    public Set mo857e() {
        return ((Map) this.f36443e).keySet();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eِؗؓ */
    public int mo2100e() {
        C17148e c17148e = (C17148e) this;
        AbstractC6690e mo2105e = c17148e.mo2105e();
        if (mo2105e.Signature()) {
            return -1;
        }
        int mo2115e = c17148e.mo2115e();
        c17148e.m4251e();
        int i = c17148e.f33631e;
        if (i == 1) {
            i = 0;
        }
        c17148e.m4251e();
        return mo2105e.appmetrica(mo2115e, i, c17148e.f33630e);
    }

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public Object m4627e(InterfaceC18116e interfaceC18116e, AbstractC9743e abstractC9743e) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f36443e;
        Object obj = concurrentHashMap.get(interfaceC18116e);
        if (obj != null) {
            return obj;
        }
        Object mo2431e = mo2431e();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(interfaceC18116e, mo2431e);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int adcel = abstractC9743e.adcel();
        for (int i = 0; i < adcel; i++) {
            if (AbstractC14416e.purchase.equals(abstractC9743e.mopub(i))) {
                abstractC9743e.advert(i);
            }
        }
        return mo2431e;
    }

    /* renamed from: eؙِٖ */
    public abstract void mo1973e(C11154e c11154e);

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؙِۡ */
    public void mo2101e(List list) {
        ((C17148e) this).mo2070e(Alert.DURATION_SHOW_INDEFINITELY, list);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّّۚ */
    public void mo2102e(C1962e c1962e) {
        ((C17148e) this).mo2076e(AbstractC17475e.ads(c1962e));
    }

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public void m4628e(String str) {
        ((Map) this.f36443e).remove(str);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّْٝ */
    public void mo2103e(C1962e c1962e) {
        ((C17148e) this).mo2076e(AbstractC17475e.ads(c1962e));
    }

    /* renamed from: eّٕۜ */
    public Cdefault mo4594e(C12241e c12241e) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    @Override // defpackage.InterfaceC17023e
    /* renamed from: eْۥؑ */
    public C7936e mo2260e() {
        throw null;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eِٓۦ */
    public boolean mo2107e(int i) {
        C17148e c17148e = (C17148e) this;
        c17148e.m4251e();
        return c17148e.f33617e.ad(i);
    }

    /* renamed from: eْٖٓ */
    public abstract void mo4264e(int i, long j, boolean z);

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٓٛۢ */
    public boolean mo2108e() {
        C17148e c17148e = (C17148e) this;
        return c17148e.billing() == 3 && c17148e.mo2129interface() && c17148e.mo2106e() == 0;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٔؖۘ */
    public void mo2109e() {
        C17148e c17148e = (C17148e) this;
        if (c17148e.mo2105e().Signature() || c17148e.applovin()) {
            m4617e();
            return;
        }
        if (!mo2083e()) {
            if (mo2081e() && mo2124e()) {
                mo4264e(c17148e.mo2115e(), -9223372036854775807L, false);
                return;
            } else {
                m4617e();
                return;
            }
        }
        int mo2100e = mo2100e();
        if (mo2100e == -1) {
            m4617e();
        } else if (mo2100e == c17148e.mo2115e()) {
            mo4264e(c17148e.mo2115e(), -9223372036854775807L, true);
        } else {
            mo4264e(mo2100e, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٌٔٗ */
    public void mo2110e(int i, C1962e c1962e) {
        ((C17148e) this).mo2135static(i, i + 1, AbstractC17475e.ads(c1962e));
    }

    @Override // defpackage.InterfaceC2484e
    /* renamed from: eٔٞۢ */
    public void mo858e(String str, List list) {
        List m4614e = m4614e(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo2760e((String) it.next());
        }
        AbstractC13480e.inmobi(m4614e, list);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٍٟٔ */
    public C1962e mo2113e() {
        C17148e c17148e = (C17148e) this;
        AbstractC6690e mo2105e = c17148e.mo2105e();
        if (mo2105e.Signature()) {
            return null;
        }
        return mo2105e.smaato(c17148e.mo2115e(), (C11501e) this.f36443e, 0L).metrica;
    }

    @Override // defpackage.InterfaceC2484e
    /* renamed from: eٔۚٙ */
    public void mo859e(String str, String str2) {
        mo2760e(str2);
        m4614e(str).add(str2);
    }

    @Override // defpackage.InterfaceC17023e
    /* renamed from: eٍٕ */
    public C13879e mo2261e() {
        throw null;
    }

    /* renamed from: eٕٛۥ, reason: contains not printable characters */
    public void m4629e(String str, List list) {
        List list2 = (List) ((Map) this.f36443e).get(str);
        Set m3582e = list2 != null ? AbstractC13480e.m3582e(list2) : C3295e.f7451e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!m3582e.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        mo858e(str, arrayList);
    }

    @Override // defpackage.InterfaceC2789e
    /* renamed from: eؘٖؕ */
    public int mo1205e(char[] cArr, int i, int i2) {
        int i3;
        Character ch = (Character) this.f36443e;
        if (ch != null) {
            cArr[i] = ch.charValue();
            this.f36443e = null;
            i3 = 1;
        } else {
            i3 = 0;
        }
        while (i3 < i2 && !mo2574e()) {
            int mo2575e = mo2575e();
            if (mo2575e <= 65535) {
                cArr[i + i3] = (char) mo2575e;
                i3++;
            } else {
                char c = (char) ((mo2575e >>> 10) + 55232);
                char c2 = (char) ((mo2575e & 1023) + 56320);
                cArr[i + i3] = c;
                int i4 = i3 + 1;
                if (i4 < i2) {
                    cArr[i4 + i] = c2;
                    i3 += 2;
                } else {
                    this.f36443e = Character.valueOf(c2);
                    i3 = i4;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘٖؗ */
    public void mo2117e(int i, int i2) {
        if (i != i2) {
            ((C17148e) this).mo2069e(i, i + 1, i2);
        }
    }

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public void m4630e(Cdefault cdefault) {
        if (!((Class) this.f36443e).isInstance(cdefault)) {
            throw new IllegalStateException("unexpected object: ".concat(cdefault.getClass().getName()));
        }
    }

    @Override // defpackage.InterfaceC17023e
    /* renamed from: eٖۤٝ */
    public C6915e mo2262e() {
        throw null;
    }

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Cdefault m4631e(byte[] bArr) {
        Cdefault inmobi = Cdefault.inmobi(bArr);
        m4630e(inmobi);
        return inmobi;
    }

    /* renamed from: eٗۚۖ */
    public abstract boolean mo2574e();

    /* renamed from: eٗۥۚ */
    public abstract int mo2575e();

    @Override // defpackage.InterfaceC16843e
    /* renamed from: e٘ٓۜ */
    public boolean mo2120e() {
        C17148e c17148e = (C17148e) this;
        AbstractC6690e mo2105e = c17148e.mo2105e();
        return !mo2105e.Signature() && mo2105e.smaato(c17148e.mo2115e(), (C11501e) this.f36443e, 0L).yandex;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: e٘ۡؗ */
    public boolean mo2124e() {
        C17148e c17148e = (C17148e) this;
        AbstractC6690e mo2105e = c17148e.mo2105e();
        return !mo2105e.Signature() && mo2105e.smaato(c17148e.mo2115e(), (C11501e) this.f36443e, 0L).startapp;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: final */
    public void mo2125final() {
        mo4264e(((C17148e) this).mo2115e(), -9223372036854775807L, false);
    }

    public InterfaceC2460e getAnnotations() {
        InterfaceC2460e interfaceC2460e = (InterfaceC2460e) this.f36443e;
        if (interfaceC2460e != null) {
            return interfaceC2460e;
        }
        m4612e(1);
        throw null;
    }

    @Override // defpackage.InterfaceC2484e
    public boolean isEmpty() {
        return ((Map) this.f36443e).isEmpty();
    }

    @Override // defpackage.InterfaceC16843e
    public void loadAd() {
        ((C17148e) this).mo2123e(false);
    }

    @Override // defpackage.InterfaceC2484e
    public Set mopub() {
        return DesugarCollections.unmodifiableSet(((Map) this.f36443e).entrySet());
    }

    @Override // defpackage.InterfaceC16843e
    public void pro() {
        ((C17148e) this).mo2123e(true);
    }

    @Override // defpackage.InterfaceC16843e
    public void purchase(float f) {
        C17148e c17148e = (C17148e) this;
        c17148e.Signature(new C4194e(f, c17148e.isVip().vip));
    }

    @Override // defpackage.InterfaceC16843e
    public void subs(int i, long j) {
        mo4264e(i, j, false);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: this */
    public void mo2139this() {
        ((C17148e) this).mo2140throws(0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: while */
    public int mo2144while() {
        if (!mo2107e(16)) {
            return 0;
        }
        C17148e c17148e = (C17148e) this;
        long mo2097e = c17148e.mo2097e();
        long duration = c17148e.getDuration();
        if (mo2097e == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return AbstractC9413e.adcel(AbstractC9413e.m2559new(mo2097e, duration), 0, 100);
    }
}
