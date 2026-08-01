package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: throws, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class Cthrows implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f36484e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f36485e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f36486e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36487e;

    public /* synthetic */ Cthrows(int i, Object obj, Object obj2, Object obj3) {
        this.f36487e = i;
        this.f36485e = obj;
        this.f36484e = obj2;
        this.f36486e = obj3;
    }

    public /* synthetic */ Cthrows(C0904e c0904e, C0243e c0243e, InterfaceC10500e interfaceC10500e, C3593e c3593e) {
        this.f36487e = 11;
        this.f36485e = c0904e;
        this.f36484e = interfaceC10500e;
        this.f36486e = c3593e;
    }

    public /* synthetic */ Cthrows(C15096e c15096e, InterfaceC1719e interfaceC1719e, C15096e c15096e2, C4807e c4807e) {
        this.f36487e = 14;
        this.f36485e = c15096e;
        this.f36484e = interfaceC1719e;
        this.f36486e = c15096e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v125, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v127, types: [eؗۘٞ] */
    /* JADX WARN: Type inference failed for: r0v64, types: [eؙْۗ] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.util.List, eًۥۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v144, types: [java.util.List, eًۥۢ] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long floatToRawIntBits;
        int i = this.f36487e;
        EnumC17426e enumC17426e = EnumC17426e.f34146e;
        EnumC7792e enumC7792e = EnumC7792e.f15793e;
        EnumC17426e enumC17426e2 = EnumC17426e.f34145e;
        int i2 = 28;
        int i3 = 19;
        final int i4 = 2;
        int i5 = 3;
        Object obj2 = this.f36486e;
        Object obj3 = this.f36484e;
        Object obj4 = this.f36485e;
        final int i6 = 1;
        switch (i) {
            case 0:
                final Cpublic cpublic = (Cpublic) obj4;
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-2283931, true, new C8124e(11, cpublic, (C16330e) obj3, (EnumC6916e) obj2)), 3);
                final int i7 = r13 ? 1 : 0;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(1227731228, true, new Function3() { // from class: finally
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i8 = i7;
                        C13770e c13770e = (C13770e) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        switch (i8) {
                            case 0:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    cpublic.m4633strictfp(R.string.about_contacts, 432, c13770e, false, false);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    cpublic.m4633strictfp(R.string.pref_about_3dcp_desc, 432, c13770e, false, false);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    cpublic.m4633strictfp(R.string.pref_about_header2, 432, c13770e, false, false);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                List list = cpublic.f36451e;
                c17213e.mopub(list.size(), null, new Cfor(list, i6, r13), new C2892e(802480018, true, new Ccontinue(list, cpublic, i6)));
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-531628643, true, new Function3() { // from class: finally
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i8 = i6;
                        C13770e c13770e = (C13770e) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        switch (i8) {
                            case 0:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    cpublic.m4633strictfp(R.string.about_contacts, 432, c13770e, false, false);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    cpublic.m4633strictfp(R.string.pref_about_3dcp_desc, 432, c13770e, false, false);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    cpublic.m4633strictfp(R.string.pref_about_header2, 432, c13770e, false, false);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                List list2 = cpublic.f36450e;
                c17213e.mopub(list2.size(), null, new Cfor(list2, i4, r13), new C2892e(802480018, true, new Ccontinue(list2, cpublic, i4)));
                AbstractC5087e.premium(c17213e, null, null, new C2892e(2003978782, true, new Function3() { // from class: finally
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i8 = i4;
                        C13770e c13770e = (C13770e) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        switch (i8) {
                            case 0:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    cpublic.m4633strictfp(R.string.about_contacts, 432, c13770e, false, false);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    cpublic.m4633strictfp(R.string.pref_about_3dcp_desc, 432, c13770e, false, false);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    cpublic.m4633strictfp(R.string.pref_about_header2, 432, c13770e, false, false);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                List list3 = cpublic.f36452e;
                c17213e.mopub(list3.size(), null, new Cfor(list3, r13 ? 1 : 0, r13), new C2892e(802480018, true, new Ccontinue(list3, cpublic, r13 ? 1 : 0)));
                return Unit.INSTANCE;
            case 1:
                C15470e c15470e = (C15470e) obj;
                int i8 = ActionCallbackBroadcastReceiver.ad;
                C10486e pro = C17583e.pro();
                pro.metrica();
                C17583e.amazon((C17583e) pro.f24447e, (String) obj4);
                int i9 = ((C10838e) obj3).ad;
                pro.metrica();
                C17583e.loadAd((C17583e) pro.f24447e, i9);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((C8280e) obj2).ad);
                ArrayList arrayList = new ArrayList(unmodifiableMap.size());
                for (Map.Entry entry : unmodifiableMap.entrySet()) {
                    arrayList.add(new C6571e(((C1696e) entry.getKey()).ad, entry.getValue()));
                }
                C6571e[] c6571eArr = (C6571e[]) arrayList.toArray(new C6571e[0]);
                Bundle vip = AbstractC2301e.vip(new C6571e("ActionCallbackBroadcastReceiver:parameters", AbstractC2301e.vip((C6571e[]) Arrays.copyOf(c6571eArr, c6571eArr.length))));
                Parcel obtain = Parcel.obtain();
                vip.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                C11507e yandex = AbstractC4002e.yandex(0, marshall.length, marshall);
                pro.metrica();
                C17583e.Signature((C17583e) pro.f24447e, yandex);
                C17583e c17583e = (C17583e) pro.ad();
                c15470e.metrica();
                C5801e.subscription((C5801e) c15470e.f24447e, c17583e);
                return Unit.INSTANCE;
            case 2:
                C15096e c15096e = (C15096e) obj4;
                C5070e c5070e = (C5070e) obj3;
                C17142e c17142e = (C17142e) obj;
                float floatValue = ((Number) c17142e.appmetrica.getValue()).floatValue() - c15096e.f29883e;
                float purchase = c5070e.license.purchase();
                c5070e.metrica(purchase + floatValue);
                float abs = Math.abs(purchase - c5070e.license.purchase());
                c15096e.f29883e = ((Number) c17142e.appmetrica.getValue()).floatValue();
                ((C15096e) obj2).f29883e = ((Number) c17142e.vip()).floatValue();
                if (Math.abs(floatValue - abs) > 0.5f) {
                    c17142e.ad();
                }
                return Unit.INSTANCE;
            case 3:
                C10685e c10685e = (C10685e) obj4;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj3;
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj2;
                if (((C0398e) interfaceC3314e.getValue()).ad.f20850e.length() > 0) {
                    c10685e.m2865private(false);
                    C10685e.m2864strictfp(interfaceC3314e, interfaceC18435e);
                }
                return Unit.INSTANCE;
            case 4:
                AbstractC5336e.purchase((InterfaceC18435e) obj4, null, 0, new C14869e((EnumC16488e) obj, (InterfaceC3314e) obj3, (C6540e) obj2, null, 15), 3);
                return Unit.INSTANCE;
            case 5:
                Celse celse = new Celse((InterfaceC18435e) obj3, (C6540e) obj2, i3);
                InterfaceC8614e[] interfaceC8614eArr = AbstractC14594e.ad;
                ((InterfaceC15671e) obj).appmetrica(AbstractC10789e.metrica, new C10591e((String) obj4, celse));
                return Unit.INSTANCE;
            case 6:
                C8006e c8006e = (C8006e) obj4;
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) obj2;
                List list4 = (List) c8006e.f16249e.getValue();
                ((C17213e) obj).mopub(list4.size(), null, new Cfor(list4, 9, r13), new C2892e(802480018, true, new C18401e(list4, c8006e, (InterfaceC3314e) obj3, interfaceC3314e2, 0)));
                return Unit.INSTANCE;
            case 7:
                C2330e c2330e = (C2330e) obj3;
                AbstractC4457e abstractC4457e = (AbstractC4457e) obj2;
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                float floatValue2 = Float.valueOf(((C0729e) ((C18464e) obj4).f36190e).f3023e).floatValue();
                float f = floatValue2 < 0.0f ? 0.0f : floatValue2;
                float f2 = 2;
                float f3 = f / f2;
                float f4 = f2 * f;
                float min = Math.min(Math.abs(c2330e.vip()), Math.abs(c2330e.ad()));
                float f5 = c2330e.vip;
                float f6 = c2330e.ad;
                r13 = f4 > min;
                long j = c2330e.appmetrica;
                C13121e c13121e = new C13121e(f, 0.0f, 0, 0, null, 30);
                if (r13) {
                    AbstractC4653e.remoteconfig(interfaceC2235e, abstractC4457e, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), (Float.floatToRawIntBits(c2330e.vip()) << 32) | (Float.floatToRawIntBits(c2330e.ad()) & 4294967295L), j, 0.0f, null, null, 0, 240);
                } else if (Float.intBitsToFloat((int) (j >> 32)) < f3) {
                    float f7 = f6 + f;
                    float f8 = f5 + f;
                    float f9 = c2330e.metrica - f;
                    float f10 = c2330e.license - f;
                    C18478e mo782finally = interfaceC2235e.mo782finally();
                    long m4560try = mo782finally.m4560try();
                    mo782finally.m4557this().billing();
                    try {
                        ((C5389e) mo782finally.f36228e).appmetrica(f7, f8, f9, f10, 0);
                        AbstractC4653e.remoteconfig(interfaceC2235e, abstractC4457e, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), (Float.floatToRawIntBits(c2330e.vip()) << 32) | (Float.floatToRawIntBits(c2330e.ad()) & 4294967295L), j, 0.0f, null, null, 0, 240);
                    } finally {
                        AbstractC0054e.m224this(mo782finally, m4560try);
                    }
                } else {
                    AbstractC4653e.remoteconfig(interfaceC2235e, abstractC4457e, (Float.floatToRawIntBits(f5 + f3) & 4294967295L) | (Float.floatToRawIntBits(f6 + f3) << 32), (Float.floatToRawIntBits(c2330e.vip() - f) << 32) | (Float.floatToRawIntBits(c2330e.ad() - f) & 4294967295L), AbstractC5756e.appmetrica(f3, j), 0.0f, c13121e, null, 0, 208);
                }
                return Unit.INSTANCE;
            case 8:
                C0763e c0763e = (C0763e) obj3;
                float f11 = c0763e.vip;
                float f12 = c0763e.license;
                float f13 = c0763e.ad;
                float f14 = c0763e.metrica;
                AbstractC4457e abstractC4457e2 = (AbstractC4457e) obj2;
                InterfaceC2235e interfaceC2235e2 = (InterfaceC2235e) obj;
                float floatValue3 = Float.valueOf(((C0729e) ((C18464e) obj4).f36190e).f3023e).floatValue();
                float f15 = floatValue3 < 0.0f ? 0.0f : floatValue3;
                float f16 = 2;
                ?? r13 = f15 * f16 > Math.min(Math.abs(f14 - f13), Math.abs(f12 - f11)) ? 1 : 0;
                if (r13 != 0) {
                    floatToRawIntBits = c0763e.yandex();
                } else {
                    float f17 = f15 / f16;
                    floatToRawIntBits = (Float.floatToRawIntBits(f13 + f17) << 32) | (Float.floatToRawIntBits(f17 + f11) & 4294967295L);
                }
                AbstractC4653e.admob(interfaceC2235e2, abstractC4457e2, floatToRawIntBits, r13 != 0 ? c0763e.billing() : (Float.floatToRawIntBits((f14 - f13) - f15) << 32) | (Float.floatToRawIntBits((f12 - f11) - f15) & 4294967295L), 0.0f, r13 != 0 ? C6590e.ad : new C13121e(f15, 0.0f, 0, 0, null, 30), null, 0, 104);
                return Unit.INSTANCE;
            case 9:
                C5423e c5423e = (C5423e) obj4;
                HashSet hashSet = (HashSet) obj3;
                InterfaceC10545e interfaceC10545e = (InterfaceC10545e) obj2;
                for (String str : c5423e.ad) {
                    if (!hashSet.contains(str)) {
                        interfaceC10545e.vip(str);
                    }
                }
                c5423e.ad = hashSet;
                return new C1023e(3);
            case 10:
                ?? r15 = (InterfaceC8346e) obj4;
                C3566e c3566e = (C3566e) obj3;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) obj2;
                C17213e c17213e2 = (C17213e) obj;
                AbstractC5087e.premium(c17213e2, null, null, new C2892e(2029495218, true, new C6599e(17, c3566e)), 3);
                AbstractC5087e.premium(c17213e2, null, null, new C2892e(-155947301, true, new C17630e(c3566e, interfaceC16132e, 7)), 3);
                AbstractC5087e.premium(c17213e2, null, null, AbstractC6143e.ad, 3);
                c17213e2.mopub(((AbstractC7674e) r15).subs(), null, new Cfor(r15, i3, r13), new C2892e(802480018, true, new C4208e(r13 ? 1 : 0, r15, c3566e, interfaceC16132e)));
                return Unit.INSTANCE;
            case 11:
                C0904e c0904e = (C0904e) obj4;
                InterfaceC10500e interfaceC10500e = (InterfaceC10500e) obj3;
                C3593e c3593e = (C3593e) obj2;
                float floatValue4 = ((Float) obj).floatValue();
                float f18 = c0904e.f3305e ? 1.0f : -1.0f;
                C11950e c11950e = c0904e.f3307e;
                long appmetrica = c11950e.appmetrica(c11950e.yandex(f18 * floatValue4));
                C11950e c11950e2 = c3593e.ad;
                float billing = c11950e.billing(c11950e.appmetrica(c11950e2.metrica(c11950e2.mopub, appmetrica, 1))) * f18;
                if (Math.abs(billing) < Math.abs(floatValue4)) {
                    AbstractC6629e.appmetrica(interfaceC10500e, "Scroll animation cancelled because scroll was not consumed (" + billing + " < " + floatValue4 + ')', null);
                }
                return Unit.INSTANCE;
            case 12:
                C7911e c7911e = (C7911e) obj4;
                C0398e c0398e = (C0398e) obj3;
                InterfaceC6256e interfaceC6256e = (InterfaceC6256e) obj2;
                InterfaceC2235e interfaceC2235e3 = (InterfaceC2235e) obj;
                C0866e license = c7911e.license();
                if (license != null) {
                    InterfaceC14576e m4557this = interfaceC2235e3.mo782finally().m4557this();
                    long j2 = ((C12347e) c7911e.ads.getValue()).ad;
                    long j3 = ((C12347e) c7911e.premium.getValue()).ad;
                    C12476e c12476e = license.ad;
                    C11447e c11447e = c7911e.isPro;
                    long j4 = c7911e.applovin;
                    if (!C12347e.license(j2)) {
                        c11447e.appmetrica(j4);
                        int billing2 = interfaceC6256e.billing(C12347e.billing(j2));
                        int billing3 = interfaceC6256e.billing(C12347e.purchase(j2));
                        if (billing2 != billing3) {
                            m4557this.appmetrica(c12476e.mopub(billing2, billing3), c11447e);
                        }
                    } else if (!C12347e.license(j3)) {
                        long metrica = c12476e.ad.vip.metrica();
                        C3618e c3618e = metrica != 16 ? new C3618e(metrica) : null;
                        long j5 = c3618e != null ? c3618e.ad : C3618e.vip;
                        c11447e.appmetrica(C3618e.vip(C3618e.license(j5) * 0.2f, j5));
                        int billing4 = interfaceC6256e.billing(C12347e.billing(j3));
                        int billing5 = interfaceC6256e.billing(C12347e.purchase(j3));
                        if (billing4 != billing5) {
                            m4557this.appmetrica(c12476e.mopub(billing4, billing5), c11447e);
                        }
                    } else if (!C12347e.license(c0398e.vip)) {
                        c11447e.appmetrica(j4);
                        long j6 = c0398e.vip;
                        int billing6 = interfaceC6256e.billing(C12347e.billing(j6));
                        int billing7 = interfaceC6256e.billing(C12347e.purchase(j6));
                        if (billing6 != billing7) {
                            m4557this.appmetrica(c12476e.mopub(billing6, billing7), c11447e);
                        }
                    }
                    AbstractC7237e.license(m4557this, c12476e);
                }
                return Unit.INSTANCE;
            case 13:
                InterfaceC18435e interfaceC18435e2 = (InterfaceC18435e) obj4;
                InterfaceC3314e interfaceC3314e3 = (InterfaceC3314e) obj3;
                C2616e c2616e = (C2616e) obj2;
                C17213e c17213e3 = (C17213e) obj;
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(60036936, true, new C14549e(interfaceC18435e2, interfaceC3314e3, i6)), 3);
                if (((C3230e) interfaceC3314e3.getValue()).f7360e) {
                    AbstractC5087e.premium(c17213e3, null, null, new C2892e(373253603, true, new C11635e(c2616e, i4)), 3);
                    AbstractC5087e.premium(c17213e3, null, null, new C2892e(514353818, true, new C17630e(c2616e, interfaceC18435e2, 11)), 3);
                }
                return Unit.INSTANCE;
            case 14:
                C15096e c15096e2 = (C15096e) obj4;
                C17142e c17142e2 = (C17142e) obj;
                float floatValue5 = ((Number) c17142e2.appmetrica.getValue()).floatValue() - c15096e2.f29883e;
                float ad = ((InterfaceC1719e) obj3).ad(floatValue5);
                c15096e2.f29883e = ((Number) c17142e2.appmetrica.getValue()).floatValue();
                ((C15096e) obj2).f29883e = ((Number) c17142e2.vip()).floatValue();
                if (Math.abs(floatValue5 - ad) > 0.5f) {
                    c17142e2.ad();
                }
                return Unit.INSTANCE;
            case 15:
                Context context = (Context) obj3;
                InterfaceC10601e interfaceC10601e = (InterfaceC10601e) obj2;
                C8024e c8024e = (C8024e) obj;
                ?? r2 = ((C17828e) obj4).ad;
                int size = r2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    AbstractC14299e abstractC14299e = (AbstractC14299e) r2.get(i10);
                    if (abstractC14299e instanceof C16118e) {
                        C16118e c16118e = (C16118e) abstractC14299e;
                        C8024e.vip(c8024e, new C11213e(21, c16118e), c16118e.metrica == 0 ? null : new C2892e(-1930700965, true, new C11783e(i6, c16118e)), new C5625e(c16118e, interfaceC10601e, 11), 6);
                    } else if (abstractC14299e instanceof C15304e) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            C17975e.mopub(c8024e, context, (C15304e) abstractC14299e);
                        }
                    } else if (abstractC14299e instanceof C10892e) {
                        c8024e.ad.add(AbstractC1749e.f4789e);
                    }
                }
                return Unit.INSTANCE;
            case 16:
                InterfaceC13158e interfaceC13158e = (InterfaceC13158e) obj4;
                C9033e c9033e = (C9033e) obj3;
                AbstractC2832e abstractC2832e = (AbstractC2832e) obj2;
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                float purchase2 = interfaceC13158e.mo398transient() ? c9033e.f18088e.startapp().purchase(((C6656e) c9033e.f18088e.billing).getValue()) : ((C2616e) c9033e.f18088e.startapp).purchase();
                boolean mo398transient = interfaceC13158e.mo398transient();
                if (Float.isNaN(purchase2)) {
                    throw new C5498e(mo398transient, c9033e.f18086e, c9033e.f18088e.startapp(), ((C6656e) c9033e.f18088e.billing).getValue());
                }
                float f19 = (AbstractC5851e.mopub(c9033e).f27610e == enumC7792e && c9033e.f18087e == enumC17426e2) ? -1.0f : 1.0f;
                EnumC17426e enumC17426e3 = c9033e.f18087e;
                float f20 = enumC17426e3 == enumC17426e2 ? purchase2 * f19 : 0.0f;
                if (enumC17426e3 != enumC17426e) {
                    purchase2 = 0.0f;
                }
                abstractC3698e.f8274e = true;
                abstractC3698e.billing(abstractC2832e, AbstractC1561e.appmetrica(f20), AbstractC1561e.appmetrica(purchase2), 0.0f);
                Unit unit = Unit.INSTANCE;
                abstractC3698e.f8274e = false;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C7857e c7857e = (C7857e) obj3;
                AbstractC2832e abstractC2832e2 = (AbstractC2832e) obj2;
                AbstractC3698e abstractC3698e2 = (AbstractC3698e) obj;
                float purchase3 = ((InterfaceC13158e) obj4).mo398transient() ? c7857e.f15906e.startapp().purchase(((C6656e) c7857e.f15906e.billing).getValue()) : ((C2616e) c7857e.f15906e.startapp).purchase();
                if (Float.isNaN(purchase3)) {
                    purchase3 = 0.0f;
                }
                float f21 = (AbstractC5851e.mopub(c7857e).f27610e == enumC7792e && c7857e.f15905e == enumC17426e2) ? -1.0f : 1.0f;
                EnumC17426e enumC17426e4 = c7857e.f15905e;
                float f22 = enumC17426e4 == enumC17426e2 ? purchase3 * f21 : 0.0f;
                if (enumC17426e4 != enumC17426e) {
                    purchase3 = 0.0f;
                }
                abstractC3698e2.f8274e = true;
                abstractC3698e2.billing(abstractC2832e2, AbstractC1561e.appmetrica(f22), AbstractC1561e.appmetrica(purchase3), 0.0f);
                Unit unit2 = Unit.INSTANCE;
                abstractC3698e2.f8274e = false;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Function0 function0 = (Function0) obj4;
                Function1 function1 = (Function1) obj3;
                InterfaceC3314e interfaceC3314e4 = (InterfaceC3314e) obj2;
                if (((C0398e) interfaceC3314e4.getValue()).ad.f20850e.length() > 0) {
                    function0.invoke();
                    function1.invoke(((C0398e) interfaceC3314e4.getValue()).ad.f20850e);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                final C4921e c4921e = (C4921e) obj4;
                C17213e c17213e4 = (C17213e) obj;
                AbstractC5087e.premium(c17213e4, null, null, AbstractC12947e.metrica, 3);
                AbstractC5087e.premium(c17213e4, null, null, AbstractC12947e.license, 3);
                AbstractC5087e.premium(c17213e4, null, null, AbstractC12947e.appmetrica, 3);
                AbstractC5087e.premium(c17213e4, null, null, new C2892e(2108402632, true, new C8124e(21, c4921e, (InterfaceC18435e) obj3, (InterfaceC16132e) obj2)), 3);
                C11999e c11999e = C11999e.ad;
                c11999e.getClass();
                C12309e c12309e = C11999e.purchase;
                InterfaceC8614e interfaceC8614e = C11999e.vip[8];
                if (((Boolean) c12309e.tapsense(c11999e)).booleanValue()) {
                    AbstractC5087e.premium(c17213e4, null, null, new C2892e(-1902084867, true, new Function3() { // from class: eْۜؔ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i11 = i6;
                            C13770e c13770e = (C13770e) obj6;
                            int intValue = ((Integer) obj7).intValue();
                            switch (i11) {
                                case 0:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                        final C4921e c4921e2 = c4921e;
                                        boolean yandex2 = c13770e.yandex(c4921e2);
                                        Object m3681throw = c13770e.m3681throw();
                                        if (yandex2 || m3681throw == C2987e.ad) {
                                            final int i12 = 1;
                                            m3681throw = new Function0() { // from class: eٍْٓ
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i12) {
                                                        case 0:
                                                            C11999e.ad.vip(false);
                                                            Activity pro2 = c4921e2.pro();
                                                            AbstractC15615e.ad(new Celse(pro2, new C15076e(null, pro2.getString(R.string.notification), pro2.getString(R.string.restart_prompt), new C6571e(pro2.getString(R.string.restart_act), new C0743e(3)), null, 113), 4));
                                                            return Unit.INSTANCE;
                                                        default:
                                                            new AbstractC16997e(false, 3).signatures(c4921e2.pro());
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            };
                                            c13770e.m3682throws(m3681throw);
                                        }
                                        AbstractC16429e.ad(AbstractC12947e.purchase, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw, 15), null, AbstractC12947e.billing, null, null, null, 0.0f, 0.0f, c13770e, 3078, 500);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        InterfaceC12864e metrica3 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                        final C4921e c4921e3 = c4921e;
                                        boolean yandex3 = c13770e.yandex(c4921e3);
                                        Object m3681throw2 = c13770e.m3681throw();
                                        if (yandex3 || m3681throw2 == C2987e.ad) {
                                            final int i13 = 0;
                                            m3681throw2 = new Function0() { // from class: eٍْٓ
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i13) {
                                                        case 0:
                                                            C11999e.ad.vip(false);
                                                            Activity pro2 = c4921e3.pro();
                                                            AbstractC15615e.ad(new Celse(pro2, new C15076e(null, pro2.getString(R.string.notification), pro2.getString(R.string.restart_prompt), new C6571e(pro2.getString(R.string.restart_act), new C0743e(3)), null, 113), 4));
                                                            return Unit.INSTANCE;
                                                        default:
                                                            new AbstractC16997e(false, 3).signatures(c4921e3.pro());
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            };
                                            c13770e.m3682throws(m3681throw2);
                                        }
                                        AbstractC16429e.ad(AbstractC12947e.yandex, AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw2, 15), null, AbstractC12947e.startapp, null, null, null, 0.0f, 0.0f, c13770e, 3078, 500);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }), 3);
                } else {
                    final int i11 = r13 ? 1 : 0;
                    AbstractC5087e.premium(c17213e4, null, null, new C2892e(1260976486, true, new Function3() { // from class: eْۜؔ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i112 = i11;
                            C13770e c13770e = (C13770e) obj6;
                            int intValue = ((Integer) obj7).intValue();
                            switch (i112) {
                                case 0:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                        final C4921e c4921e2 = c4921e;
                                        boolean yandex2 = c13770e.yandex(c4921e2);
                                        Object m3681throw = c13770e.m3681throw();
                                        if (yandex2 || m3681throw == C2987e.ad) {
                                            final int i12 = 1;
                                            m3681throw = new Function0() { // from class: eٍْٓ
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i12) {
                                                        case 0:
                                                            C11999e.ad.vip(false);
                                                            Activity pro2 = c4921e2.pro();
                                                            AbstractC15615e.ad(new Celse(pro2, new C15076e(null, pro2.getString(R.string.notification), pro2.getString(R.string.restart_prompt), new C6571e(pro2.getString(R.string.restart_act), new C0743e(3)), null, 113), 4));
                                                            return Unit.INSTANCE;
                                                        default:
                                                            new AbstractC16997e(false, 3).signatures(c4921e2.pro());
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            };
                                            c13770e.m3682throws(m3681throw);
                                        }
                                        AbstractC16429e.ad(AbstractC12947e.purchase, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw, 15), null, AbstractC12947e.billing, null, null, null, 0.0f, 0.0f, c13770e, 3078, 500);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        InterfaceC12864e metrica3 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                        final C4921e c4921e3 = c4921e;
                                        boolean yandex3 = c13770e.yandex(c4921e3);
                                        Object m3681throw2 = c13770e.m3681throw();
                                        if (yandex3 || m3681throw2 == C2987e.ad) {
                                            final int i13 = 0;
                                            m3681throw2 = new Function0() { // from class: eٍْٓ
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i13) {
                                                        case 0:
                                                            C11999e.ad.vip(false);
                                                            Activity pro2 = c4921e3.pro();
                                                            AbstractC15615e.ad(new Celse(pro2, new C15076e(null, pro2.getString(R.string.notification), pro2.getString(R.string.restart_prompt), new C6571e(pro2.getString(R.string.restart_act), new C0743e(3)), null, 113), 4));
                                                            return Unit.INSTANCE;
                                                        default:
                                                            new AbstractC16997e(false, 3).signatures(c4921e3.pro());
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            };
                                            c13770e.m3682throws(m3681throw2);
                                        }
                                        AbstractC16429e.ad(AbstractC12947e.yandex, AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw2, 15), null, AbstractC12947e.startapp, null, null, null, 0.0f, 0.0f, c13770e, 3078, 500);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }), 3);
                }
                return Unit.INSTANCE;
            case 20:
                List list5 = (List) obj4;
                C8004e c8004e = (C8004e) obj3;
                C17213e c17213e5 = (C17213e) obj;
                c17213e5.mopub(list5.size(), null, new C6262e(i6, list5), new C2892e(802480018, true, new C4208e(i5, list5, c8004e, (InterfaceC3314e) obj2)));
                AbstractC5087e.premium(c17213e5, null, null, new C2892e(-453416536, true, new C8233e(c8004e, r13 ? 1 : 0)), 3);
                return Unit.INSTANCE;
            case 21:
                C0764e c0764e = (C0764e) obj4;
                C11379e c11379e = (C11379e) obj3;
                C2616e c2616e2 = (C2616e) obj2;
                C17213e c17213e6 = (C17213e) obj;
                AbstractC5087e.premium(c17213e6, null, null, new C2892e(-1682844696, true, new C0428e(c0764e, i4)), 3);
                if (((C6019e) c0764e.f3119e.getValue()).f12677e) {
                    AbstractC5087e.premium(c17213e6, null, null, new C2892e(430586179, true, new C17422e(c11379e, i6)), 3);
                    AbstractC5087e.premium(c17213e6, null, null, new C2892e(1776982970, true, new C5061e(i4, c0764e, c2616e2)), 3);
                }
                return Unit.INSTANCE;
            case 22:
                Void r0 = (Void) obj;
                ((C5306e) obj4).subscription((C13945e) obj3, AbstractC7093e.ad((Context) obj2));
                return r0;
            case 23:
                InterfaceC16400e interfaceC16400e = (InterfaceC16400e) obj4;
                final C0057e c0057e = (C0057e) obj3;
                final Function1 function12 = (Function1) obj2;
                final ?? obj5 = new Object();
                InterfaceC12179e interfaceC12179e = new InterfaceC12179e() { // from class: eّۣٟ
                    @Override // defpackage.InterfaceC12179e
                    public final void Signature(InterfaceC16400e interfaceC16400e2, EnumC14621e enumC14621e) {
                        int i12 = AbstractC4414e.ad[enumC14621e.ordinal()];
                        C4246e c4246e = obj5;
                        if (i12 == 1) {
                            c4246e.f9318e = function12.invoke(C0057e.this);
                        } else {
                            if (i12 != 2) {
                                return;
                            }
                            C10628e c10628e = (C10628e) c4246e.f9318e;
                            if (c10628e != null) {
                                c10628e.ad();
                            }
                            c4246e.f9318e = null;
                        }
                    }
                };
                interfaceC16400e.vip().ad(interfaceC12179e);
                return new C18034e(i6, interfaceC16400e, interfaceC12179e, obj5);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C16089e c16089e = (C16089e) obj4;
                XTrackLyrics xTrackLyrics = new XTrackLyrics();
                c16089e.getClass();
                xTrackLyrics.license(C16089e.license((AbstractC16049e) obj3));
                C11817e c11817e = (C11817e) c16089e.f31681e;
                c11817e.getClass();
                xTrackLyrics.metrica(c11817e.purchase(InterfaceC2558e.Companion.serializer(), (InterfaceC2558e) obj2));
                return (XTrackLyrics) ((C5114e) obj).m1757e(xTrackLyrics);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C10876e c10876e = (C10876e) obj4;
                C9669e c9669e = (C9669e) obj2;
                C17213e c17213e7 = (C17213e) obj;
                AbstractC5087e.premium(c17213e7, null, null, AbstractC12110e.ad, 3);
                AbstractC5087e.premium(c17213e7, null, null, new C2892e(100038192, true, new C9490e(c10876e, (InterfaceC18435e) obj3, c9669e, i6)), 3);
                AbstractC5087e.premium(c17213e7, null, null, AbstractC12110e.license, 3);
                c17213e7.mopub(EnumC4169e.f9187e.subs(), null, new C3801e(3), new C2892e(802480018, true, new C4290e(c9669e, c10876e)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                final InterfaceC18435e interfaceC18435e3 = (InterfaceC18435e) obj4;
                final InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) obj3;
                C12785e c12785e = (C12785e) obj2;
                C17213e c17213e8 = (C17213e) obj;
                final int i12 = r13 ? 1 : 0;
                AbstractC5087e.premium(c17213e8, null, null, new C2892e(-1175158798, true, new Function3() { // from class: eًٖٗ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        switch (i12) {
                            case 0:
                                C13770e c13770e = (C13770e) obj7;
                                int intValue = ((Integer) obj8).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    boolean z = ((C13034e) interfaceC16132e2.getValue()).f25959e;
                                    InterfaceC18435e interfaceC18435e4 = interfaceC18435e3;
                                    boolean yandex2 = c13770e.yandex(interfaceC18435e4);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex2 || m3681throw == C2987e.ad) {
                                        m3681throw = new C17744e(interfaceC18435e4, 16);
                                        c13770e.m3682throws(m3681throw);
                                    }
                                    AbstractC16565e.vip(z, (Function1) m3681throw, AbstractC12220e.mopub(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16), c13770e, 384);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e2 = (C13770e) obj7;
                                int intValue2 = ((Integer) obj8).intValue();
                                boolean z2 = true;
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    InterfaceC3314e license2 = AbstractC4628e.license(AbstractC12918e.metrica.ad.metrica, c13770e2, 0);
                                    InterfaceC16132e interfaceC16132e3 = interfaceC16132e2;
                                    if (!((C13034e) interfaceC16132e3.getValue()).f25962e && !(((InterfaceC2135e) license2.getValue()) instanceof C3897e)) {
                                        z2 = false;
                                    }
                                    InterfaceC12864e ad2 = AbstractC1376e.ad(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), z2 ? 1.0f : 0.75f);
                                    InterfaceC18435e interfaceC18435e5 = interfaceC18435e3;
                                    boolean yandex3 = c13770e2.yandex(interfaceC18435e5) | c13770e2.purchase(interfaceC16132e3);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex3 || m3681throw2 == C2987e.ad) {
                                        m3681throw2 = new C1708e(interfaceC18435e5, interfaceC16132e3, 25);
                                        c13770e2.m3682throws(m3681throw2);
                                    }
                                    AbstractC16429e.ad(C17150e.appmetrica, AbstractC9546e.license(ad2, false, null, (Function0) m3681throw2, 15), null, AbstractC16653e.license(1757321142, new C10100e(license2, 2), c13770e2), null, AbstractC16653e.license(-1017377676, new C15545e(interfaceC18435e5, interfaceC16132e3, z2, 3), c13770e2), null, 0.0f, 0.0f, c13770e2, 199686, 468);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                if (((C13034e) interfaceC16132e2.getValue()).f25959e) {
                    AbstractC5087e.premium(c17213e8, null, null, new C2892e(857588279, true, new Function3() { // from class: eًٖٗ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            switch (i6) {
                                case 0:
                                    C13770e c13770e = (C13770e) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        boolean z = ((C13034e) interfaceC16132e2.getValue()).f25959e;
                                        InterfaceC18435e interfaceC18435e4 = interfaceC18435e3;
                                        boolean yandex2 = c13770e.yandex(interfaceC18435e4);
                                        Object m3681throw = c13770e.m3681throw();
                                        if (yandex2 || m3681throw == C2987e.ad) {
                                            m3681throw = new C17744e(interfaceC18435e4, 16);
                                            c13770e.m3682throws(m3681throw);
                                        }
                                        AbstractC16565e.vip(z, (Function1) m3681throw, AbstractC12220e.mopub(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16), c13770e, 384);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e2 = (C13770e) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    boolean z2 = true;
                                    if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        InterfaceC3314e license2 = AbstractC4628e.license(AbstractC12918e.metrica.ad.metrica, c13770e2, 0);
                                        InterfaceC16132e interfaceC16132e3 = interfaceC16132e2;
                                        if (!((C13034e) interfaceC16132e3.getValue()).f25962e && !(((InterfaceC2135e) license2.getValue()) instanceof C3897e)) {
                                            z2 = false;
                                        }
                                        InterfaceC12864e ad2 = AbstractC1376e.ad(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), z2 ? 1.0f : 0.75f);
                                        InterfaceC18435e interfaceC18435e5 = interfaceC18435e3;
                                        boolean yandex3 = c13770e2.yandex(interfaceC18435e5) | c13770e2.purchase(interfaceC16132e3);
                                        Object m3681throw2 = c13770e2.m3681throw();
                                        if (yandex3 || m3681throw2 == C2987e.ad) {
                                            m3681throw2 = new C1708e(interfaceC18435e5, interfaceC16132e3, 25);
                                            c13770e2.m3682throws(m3681throw2);
                                        }
                                        AbstractC16429e.ad(C17150e.appmetrica, AbstractC9546e.license(ad2, false, null, (Function0) m3681throw2, 15), null, AbstractC16653e.license(1757321142, new C10100e(license2, 2), c13770e2), null, AbstractC16653e.license(-1017377676, new C15545e(interfaceC18435e5, interfaceC16132e3, z2, 3), c13770e2), null, 0.0f, 0.0f, c13770e2, 199686, 468);
                                    } else {
                                        c13770e2.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }), 3);
                    if (!((C13034e) interfaceC16132e2.getValue()).f25962e) {
                        AbstractC5087e.premium(c17213e8, null, null, C17150e.purchase, 3);
                        AbstractC5087e.premium(c17213e8, null, null, new C2892e(240947365, true, new C18512e(c12785e, i6)), 3);
                        List list6 = ((C13034e) interfaceC16132e2.getValue()).f25957e;
                        c17213e8.mopub(list6.size(), null, new C6262e(i3, list6), new C2892e(802480018, true, new C18401e(list6, interfaceC18435e3, interfaceC16132e2, c12785e, 4)));
                    }
                } else {
                    AbstractC5087e.premium(c17213e8, null, null, new C2892e(-1984304946, true, new C18512e(c12785e, i4)), 3);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C9013e c9013e = (C9013e) obj3;
                C17213e c17213e9 = (C17213e) obj;
                AbstractC5087e.premium(c17213e9, null, null, new C2892e(790956681, true, new C17630e((InterfaceC18435e) obj4, c9013e, i2)), 3);
                AbstractC5087e.premium(c17213e9, null, null, new C2892e(558035634, true, new C17871e(10, c9013e)), 3);
                AbstractC5087e.premium(c17213e9, null, null, new C2892e(-1315177903, true, new C17630e((InterfaceC16132e) obj2, c9013e, 29)), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj3;
                InterfaceC3886e interfaceC3886e = (InterfaceC3886e) obj2;
                C4017e c4017e = (C4017e) obj;
                long j7 = ((C2108e) ((C17642e) obj4).get()).ad;
                float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                if (intBitsToFloat > 0.0f) {
                    float mo497instanceof = c4017e.mo497instanceof(AbstractC11257e.ad);
                    C14434e c14434e = c4017e.f8940e;
                    float ad2 = interfaceC3886e.ad(AbstractC1561e.appmetrica(intBitsToFloat), AbstractC1561e.appmetrica((Float.intBitsToFloat((int) (c14434e.f28537e.m4560try() >> 32)) - r7) - c4017e.mo497instanceof(interfaceC12123e.metrica(c4017e.getLayoutDirection()))), c4017e.getLayoutDirection()) + c4017e.mo497instanceof(interfaceC12123e.vip(c4017e.getLayoutDirection()));
                    float f23 = 2;
                    float f24 = intBitsToFloat / f23;
                    float f25 = ad2 + f24;
                    float f26 = (f25 - f24) - mo497instanceof;
                    float f27 = f26 < 0.0f ? 0.0f : f26;
                    float f28 = f25 + f24 + mo497instanceof;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (c14434e.f28537e.m4560try() >> 32));
                    float f29 = f28 > intBitsToFloat2 ? intBitsToFloat2 : f28;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                    float f30 = (-intBitsToFloat3) / f23;
                    float f31 = intBitsToFloat3 / f23;
                    C18478e c18478e = c14434e.f28537e;
                    long m4560try2 = c18478e.m4560try();
                    c18478e.m4557this().billing();
                    try {
                        ((C5389e) c18478e.f36228e).appmetrica(f27, f30, f29, f31, 0);
                        c4017e.ad();
                    } finally {
                        AbstractC0054e.m224this(c18478e, m4560try2);
                    }
                } else {
                    c4017e.ad();
                }
                return Unit.INSTANCE;
            default:
                C1925e c1925e = (C1925e) obj3;
                C17213e c17213e10 = (C17213e) obj;
                ?? r3 = (InterfaceC8346e) ((InterfaceC16132e) obj4).getValue();
                C12676e c12676e = C12676e.f25410e;
                c17213e10.mopub(((AbstractC7674e) r3).subs(), new C6262e((InterfaceC8346e) r3, 25), new C6262e(26, (List) r3), new C2892e(802480018, true, new C6178e(r3, c1925e, i6)));
                if (((Boolean) ((InterfaceC16132e) obj2).getValue()).booleanValue()) {
                    AbstractC5087e.premium(c17213e10, null, null, new C2892e(-2126650915, true, new C3648e(c1925e, i6)), 3);
                }
                return Unit.INSTANCE;
        }
    }
}
