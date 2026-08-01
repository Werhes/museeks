package defpackage;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Parcel;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15024e implements InterfaceC11305e, InterfaceC13646e, InterfaceC17771e, InterfaceC10153e, InterfaceC10283e, InterfaceC17847e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f29787e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f29788e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f29789e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29790e;

    public C15024e(int i) {
        this.f29790e = i;
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            default:
                this.f29788e = new HashMap();
                this.f29787e = new HashMap();
                this.f29789e = new HashMap();
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.f29788e = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.f29787e = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f29789e = new ConcurrentHashMap();
                return;
        }
    }

    public /* synthetic */ C15024e(int i, Object obj, Object obj2, Object obj3) {
        this.f29790e = i;
        this.f29788e = obj;
        this.f29787e = obj2;
        this.f29789e = obj3;
    }

    public C15024e(WorkDatabase_Impl workDatabase_Impl, int i) {
        this.f29790e = i;
        switch (i) {
            case 12:
                this.f29788e = workDatabase_Impl;
                new AtomicBoolean(false);
                this.f29787e = new C9707e(workDatabase_Impl, 1);
                this.f29789e = new C9707e(workDatabase_Impl, 2);
                return;
            default:
                this.f29788e = workDatabase_Impl;
                this.f29787e = new C3606e(workDatabase_Impl, 2);
                this.f29789e = new C9707e(workDatabase_Impl, 0);
                return;
        }
    }

    public C15024e(AppBarLayout appBarLayout, ActionMenuView actionMenuView, ImageView imageView, TextView textView) {
        this.f29790e = 11;
        this.f29788e = appBarLayout;
        this.f29787e = actionMenuView;
        this.f29789e = textView;
    }

    public C15024e(InterfaceC1966e interfaceC1966e, C15024e c15024e) {
        this.f29790e = 9;
        this.f29788e = interfaceC1966e;
        this.f29787e = c15024e;
        this.f29789e = interfaceC1966e.getValue();
    }

    public C15024e(C6467e c6467e, Function3 function3) {
        this.f29790e = 4;
        this.f29788e = c6467e;
        this.f29787e = function3;
        this.f29789e = C15042e.f29803e;
    }

    public C15024e(AbstractC13859e abstractC13859e, AbstractC13859e abstractC13859e2, InterfaceC17022e interfaceC17022e) {
        this.f29790e = 8;
        this.f29789e = abstractC13859e;
        this.f29788e = abstractC13859e2;
        this.f29787e = interfaceC17022e;
    }

    public C15024e(InterfaceC17031e interfaceC17031e) {
        this.f29790e = 5;
        C15841e c15841e = C15841e.vip;
        this.f29788e = interfaceC17031e;
        this.f29787e = AbstractC14430e.license(1);
        this.f29789e = AbstractC14430e.appmetrica(c15841e);
    }

    public C15024e(Object obj) {
        this.f29790e = 0;
        this.f29788e = new C12452e();
        this.f29787e = new C12328e();
        this.f29789e = obj;
    }

    public C15024e(List list) {
        this.f29790e = 10;
        this.f29788e = list;
        this.f29787e = new InterfaceC18147e[list.size()];
        C17790e c17790e = new C17790e(new C2007e(22, this));
        this.f29789e = c17790e;
        c17790e.m4435try(3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙِْ, eٍُؒ, java.lang.Object] */
    @Override // defpackage.InterfaceC17771e
    public InterfaceC10898e Signature(InterfaceC16186e interfaceC16186e) {
        C10398e c10398e = (C10398e) this.f29788e;
        byte[] bArr = (byte[]) this.f29789e;
        byte[] bArr2 = (byte[]) this.f29787e;
        ?? obj = new Object();
        Hashtable hashtable = AbstractC3874e.ad;
        String algorithmName = c10398e.getAlgorithmName();
        if (256 > ((Integer) AbstractC3874e.ad.get(algorithmName.substring(0, algorithmName.indexOf("/")))).intValue()) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (interfaceC16186e.entropySize() < 256) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        obj.f13184e = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        obj.f13182e = interfaceC16186e;
        obj.f13187e = c10398e;
        byte[] entropy = interfaceC16186e.getEntropy();
        if (entropy.length < (PSKKeyManager.MAX_KEY_LENGTH_BYTES + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        byte[] mopub = AbstractC12442e.mopub(entropy, bArr2, bArr);
        int i = c10398e.f20548e;
        obj.f13183e = new byte[i];
        byte[] bArr3 = new byte[i];
        obj.f13185e = bArr3;
        Arrays.fill(bArr3, (byte) 1);
        obj.pro((byte) 0, mopub);
        if (mopub != null) {
            obj.pro((byte) 1, mopub);
        }
        obj.f13186e = 1L;
        return obj;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        C8988e c8988e = (C8988e) obj2;
        switch (this.f29790e) {
            case 14:
                C4612e c4612e = (C4612e) this.f29788e;
                InterfaceC13524e interfaceC13524e = (InterfaceC13524e) this.f29787e;
                String str = (String) this.f29789e;
                C4379e c4379e = (C4379e) obj;
                AbstractC9528e.mopub("Not active connection", c4612e.f9941class != 1);
                if (interfaceC13524e != null) {
                    C1091e c1091e = (C1091e) c4379e.loadAd();
                    C10988e appmetrica = AbstractC10432e.appmetrica();
                    Parcel m4156e = c1091e.m4156e();
                    m4156e.writeString(str);
                    AbstractC3336e.vip(m4156e, appmetrica);
                    c1091e.m4151e(m4156e, 12);
                }
                c8988e.vip(null);
                return;
            case 15:
                C4612e c4612e2 = (C4612e) this.f29788e;
                String str2 = (String) this.f29787e;
                C9753e c9753e = (C9753e) this.f29789e;
                C4379e c4379e2 = (C4379e) obj;
                AbstractC9528e.mopub("Not connected to device", c4612e2.f9941class == 3);
                C1091e c1091e2 = (C1091e) c4379e2.loadAd();
                C10988e appmetrica2 = AbstractC10432e.appmetrica();
                Parcel m4156e2 = c1091e2.m4156e();
                m4156e2.writeString(str2);
                AbstractC3336e.vip(m4156e2, c9753e);
                AbstractC3336e.vip(m4156e2, appmetrica2);
                c1091e2.m4151e(m4156e2, 13);
                synchronized (c4612e2.subscription) {
                    try {
                        if (c4612e2.loadAd != null) {
                            c4612e2.adcel(2477);
                        }
                        c4612e2.loadAd = c8988e;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                C18117e c18117e = (C18117e) ((C1540e) obj).loadAd();
                BinderC15538e binderC15538e = new BinderC15538e((C3355e) this.f29788e, (C2580e) this.f29789e);
                String str3 = (String) this.f29787e;
                Parcel m4156e3 = c18117e.m4156e();
                m4156e3.writeString(str3);
                AbstractC1757e.metrica(m4156e3, binderC15538e);
                c18117e.m4155e(m4156e3, 28);
                return;
        }
    }

    @Override // defpackage.InterfaceC2861e
    public InterfaceC18107e ad() {
        return ((InterfaceC13646e) this.f29789e).ad();
    }

    @Override // defpackage.InterfaceC2861e
    public InterfaceC11129e adcel() {
        return ((InterfaceC13646e) this.f29789e).adcel();
    }

    @Override // defpackage.InterfaceC2861e
    public InterfaceC11129e admob() {
        return ((InterfaceC13646e) this.f29789e).admob();
    }

    public void ads() {
        C0583e c0583e = (C0583e) this.f29788e;
        String str = (String) this.f29787e;
        List list = (List) c0583e.advert(str);
        if (list != null) {
            list.remove((Function0) this.f29789e);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c0583e.amazon(str, list);
    }

    @Override // defpackage.InterfaceC11305e
    public void advert() {
        ((C12452e) this.f29788e).ad(0);
    }

    @Override // defpackage.InterfaceC11305e
    public void amazon(int i, Object obj) {
        C12452e c12452e = (C12452e) this.f29788e;
        c12452e.ad(6);
        c12452e.ad(i);
        ((C12328e) this.f29787e).ad(obj);
    }

    public void applovin(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f29788e;
        workDatabase_Impl.vip();
        C9707e c9707e = (C9707e) this.f29789e;
        C1573e ad = c9707e.ad();
        if (str == null) {
            ad.advert(1);
        } else {
            ad.loadAd(1, str);
        }
        workDatabase_Impl.metrica();
        try {
            ad.crashlytics();
            workDatabase_Impl.yandex();
        } finally {
            workDatabase_Impl.purchase();
            c9707e.metrica(ad);
        }
    }

    @Override // defpackage.InterfaceC11305e
    public void appmetrica(Object obj) {
        ((C12452e) this.f29788e).ad(1);
        ((C12328e) this.f29787e).ad(obj);
    }

    @Override // defpackage.InterfaceC11305e
    public void billing() {
        ((C12452e) this.f29788e).ad(8);
    }

    @Override // defpackage.InterfaceC17771e
    public String getAlgorithm() {
        return "HMAC-DRBG-" + AbstractC9386e.ad(((C10398e) this.f29788e).f20550e);
    }

    @Override // defpackage.InterfaceC10283e
    public View getRoot() {
        return (AppBarLayout) this.f29788e;
    }

    public boolean inmobi() {
        if (((InterfaceC16132e) this.f29788e).getValue() != this.f29789e) {
            return true;
        }
        C15024e c15024e = (C15024e) this.f29787e;
        return c15024e != null && c15024e.inmobi();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001c. Please report as an issue. */
    public void isPro(AbstractC7919e abstractC7919e, C14995e c14995e) {
        Exception exc;
        int i;
        int i2;
        C12452e c12452e = (C12452e) this.f29788e;
        int i3 = c12452e.vip;
        C12328e c12328e = (C12328e) this.f29787e;
        C12328e c12328e2 = new C12328e();
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i4 + 1;
            try {
                try {
                    switch (c12452e.metrica(i4)) {
                        case 0:
                            abstractC7919e.advert();
                            i4 = i6;
                        case 1:
                            int i7 = i5 + 1;
                            abstractC7919e.appmetrica(c12328e.yandex(i5));
                            i5 = i7;
                            i4 = i6;
                        case 2:
                            int i8 = i4 + 2;
                            i4 += 3;
                            abstractC7919e.startapp(c12452e.metrica(i6), c12452e.metrica(i8));
                        case 3:
                            int i9 = i4 + 2;
                            try {
                                i = i4 + 3;
                            } catch (Exception e) {
                                exc = e;
                                i4 = i9;
                            }
                            try {
                                i4 += 4;
                                abstractC7919e.yandex(c12452e.metrica(i6), c12452e.metrica(i9), c12452e.metrica(i));
                            } catch (Exception e2) {
                                exc = e2;
                                i4 = i;
                                throw new C4726e(c12328e, c12328e2, c12452e, i4 - 1, exc);
                            }
                        case 4:
                            abstractC7919e.ad();
                            i4 = i6;
                        case 5:
                            i4 += 2;
                            i2 = i5 + 1;
                            abstractC7919e.license(c12452e.metrica(i6), c12328e.yandex(i5));
                            i5 = i2;
                        case 6:
                            i4 += 2;
                            try {
                                i2 = i5 + 1;
                                abstractC7919e.amazon(c12452e.metrica(i6), c12328e.yandex(i5));
                                i5 = i2;
                            } catch (Exception e3) {
                                exc = e3;
                                throw new C4726e(c12328e, c12328e2, c12452e, i4 - 1, exc);
                            }
                        case 7:
                            int i10 = i5 + 1;
                            Object yandex = c12328e.yandex(i5);
                            AbstractC9476e.purchase(2, yandex);
                            i5 += 2;
                            abstractC7919e.smaato(c12328e.yandex(i10), (Function2) yandex);
                            i4 = i6;
                        case 8:
                            Object obj = abstractC7919e.f16034e;
                            if (obj instanceof InterfaceC16503e) {
                                InterfaceC16503e interfaceC16503e = (InterfaceC16503e) obj;
                                if (((C12431e) c14995e.purchase).smaato(interfaceC16503e)) {
                                    interfaceC16503e.vip();
                                }
                            }
                            c12328e2.ad(obj);
                            abstractC7919e.billing();
                            i4 = i6;
                        default:
                            i4 = i6;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i4 = i6;
                }
            } catch (Throwable th) {
                abstractC7919e.loadAd();
                throw th;
            }
        }
        if (i5 != c12328e.vip) {
            AbstractC1889e.ad("Applier operation size mismatch");
        }
        c12328e.purchase();
        c12452e.vip = 0;
        abstractC7919e.loadAd();
    }

    public void isVip(C17108e c17108e) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f29788e;
        workDatabase_Impl.vip();
        workDatabase_Impl.metrica();
        try {
            ((C3606e) this.f29787e).appmetrica(c17108e);
            workDatabase_Impl.yandex();
        } finally {
            workDatabase_Impl.purchase();
        }
    }

    @Override // defpackage.InterfaceC11305e
    public void license(int i, Object obj) {
        C12452e c12452e = (C12452e) this.f29788e;
        c12452e.ad(5);
        c12452e.ad(i);
        ((C12328e) this.f29787e).ad(obj);
    }

    @Override // defpackage.InterfaceC11305e
    public /* synthetic */ void loadAd() {
    }

    @Override // defpackage.InterfaceC2861e
    public InterfaceC6141e metrica() {
        return (C18325e) this.f29788e;
    }

    @Override // defpackage.InterfaceC2861e
    public InterfaceC13033e mopub() {
        return ((InterfaceC13646e) this.f29789e).mopub();
    }

    public void premium(String str, int i, String str2) {
        ((HashMap) this.f29788e).put(str, str2);
        ((HashMap) this.f29787e).put(str2, str);
        ((HashMap) this.f29789e).put(str, Integer.valueOf(i));
    }

    public void pro(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        InterfaceC18147e[] interfaceC18147eArr = (InterfaceC18147e[]) this.f29787e;
        for (int i = 0; i < interfaceC18147eArr.length; i++) {
            c18316e.ad();
            c18316e.vip();
            InterfaceC18147e Signature = interfaceC5483e.Signature(c18316e.license, 3);
            C16975e c16975e = (C16975e) ((List) this.f29788e).get(i);
            String str = c16975e.loadAd;
            AbstractC2301e.startapp("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            C11445e c11445e = new C11445e();
            c18316e.vip();
            c11445e.ad = c18316e.appmetrica;
            c11445e.smaato = AbstractC8542e.amazon("video/mp2t");
            c11445e.amazon = AbstractC8542e.amazon(str);
            c11445e.appmetrica = c16975e.appmetrica;
            c11445e.license = c16975e.license;
            c11445e.f23019extends = c16975e.f33286throw;
            c11445e.admob = c16975e.subscription;
            AbstractC8647e.firebase(c11445e, Signature);
            interfaceC18147eArr[i] = Signature;
        }
    }

    @Override // defpackage.InterfaceC2861e
    public InterfaceC7600e purchase() {
        return ((InterfaceC13646e) this.f29789e).purchase();
    }

    public void remoteconfig(long j, C1292e c1292e) {
        if (c1292e.ad() < 9) {
            return;
        }
        int smaato = c1292e.smaato();
        int smaato2 = c1292e.smaato();
        int ads = c1292e.ads();
        if (smaato == 434 && smaato2 == 1195456820 && ads == 3) {
            ((C17790e) this.f29789e).ad(j, c1292e);
        }
    }

    public C17108e signatures(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f29788e;
        C6096e purchase = C6096e.purchase(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            purchase.loadAd(1);
        } else {
            purchase.Signature(1, str);
        }
        workDatabase_Impl.vip();
        Cursor billing = workDatabase_Impl.billing(purchase);
        try {
            return billing.moveToFirst() ? new C17108e(billing.getString(AbstractC12640e.startapp(billing, "work_spec_id")), billing.getInt(AbstractC12640e.startapp(billing, "system_id"))) : null;
        } finally {
            billing.close();
            purchase.isVip();
        }
    }

    @Override // defpackage.InterfaceC11305e
    public void smaato(Object obj, Function2 function2) {
        ((C12452e) this.f29788e).ad(7);
        C12328e c12328e = (C12328e) this.f29787e;
        c12328e.ad(function2);
        c12328e.ad(obj);
    }

    @Override // defpackage.InterfaceC11305e
    public void startapp(int i, int i2) {
        C12452e c12452e = (C12452e) this.f29788e;
        c12452e.ad(2);
        c12452e.ad(i);
        c12452e.ad(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void subs(defpackage.AbstractC7244e r10, java.util.Set r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15024e.subs(eؚٖٙ, java.util.Set, java.lang.String):void");
    }

    @Override // defpackage.InterfaceC13646e
    public C13886e subscription() {
        return (C13886e) this.f29787e;
    }

    public Object tapsense(Object obj) {
        return ((SharedPreferences) this.f29788e).getString((String) this.f29787e, (String) this.f29789e);
    }

    @Override // defpackage.InterfaceC2861e
    public C10894e vip() {
        return ((InterfaceC13646e) this.f29789e).vip();
    }

    @Override // defpackage.InterfaceC11305e
    public void yandex(int i, int i2, int i3) {
        C12452e c12452e = (C12452e) this.f29788e;
        c12452e.ad(3);
        c12452e.ad(i);
        c12452e.ad(i2);
        c12452e.ad(i3);
    }
}
