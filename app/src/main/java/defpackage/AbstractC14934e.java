package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۙؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14934e extends AbstractC8797e {
    public final MeasurementManager loadAd;

    public AbstractC14934e(MeasurementManager measurementManager) {
        this.loadAd = measurementManager;
    }

    public static Object Signature(AbstractC14934e abstractC14934e, AbstractC2162e abstractC2162e, InterfaceC5083e interfaceC5083e) {
        new C13578e(1, AbstractC10558e.startapp(interfaceC5083e)).tapsense();
        MeasurementManager measurementManager = abstractC14934e.loadAd;
        throw null;
    }

    public static Object adcel(AbstractC14934e abstractC14934e, InterfaceC5083e interfaceC5083e) {
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(interfaceC5083e));
        c13578e.tapsense();
        abstractC14934e.loadAd.getMeasurementApiStatus(new ExecutorC14279e(2), new C3389e(c13578e));
        return c13578e.signatures();
    }

    public static /* synthetic */ Object advert(AbstractC14934e abstractC14934e, AbstractC0803e abstractC0803e, InterfaceC5083e interfaceC5083e) {
        Object appmetrica = AbstractC9743e.appmetrica(new C10954e(abstractC14934e, null, 1), interfaceC5083e);
        return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
    }

    public static Object amazon(AbstractC14934e abstractC14934e, Uri uri, InterfaceC5083e interfaceC5083e) {
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(interfaceC5083e));
        c13578e.tapsense();
        abstractC14934e.loadAd.registerTrigger(uri, new ExecutorC14279e(2), new C3389e(c13578e));
        Object signatures = c13578e.signatures();
        return signatures == EnumC2821e.f6782e ? signatures : Unit.INSTANCE;
    }

    public static Object smaato(AbstractC14934e abstractC14934e, Uri uri, InputEvent inputEvent, InterfaceC5083e interfaceC5083e) {
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(interfaceC5083e));
        c13578e.tapsense();
        abstractC14934e.loadAd.registerSource(uri, inputEvent, new ExecutorC14279e(2), new C3389e(c13578e));
        Object signatures = c13578e.signatures();
        return signatures == EnumC2821e.f6782e ? signatures : Unit.INSTANCE;
    }

    public static Object startapp(AbstractC14934e abstractC14934e, AbstractC0021e abstractC0021e, InterfaceC5083e interfaceC5083e) {
        new C13578e(1, AbstractC10558e.startapp(interfaceC5083e)).tapsense();
        MeasurementManager measurementManager = abstractC14934e.loadAd;
        throw null;
    }

    public static Object subscription(AbstractC14934e abstractC14934e, AbstractC12645e abstractC12645e, InterfaceC5083e interfaceC5083e) {
        new C13578e(1, AbstractC10558e.startapp(interfaceC5083e)).tapsense();
        MeasurementManager measurementManager = abstractC14934e.loadAd;
        throw null;
    }

    public Object admob(AbstractC12645e abstractC12645e, InterfaceC5083e interfaceC5083e) {
        return subscription(this, abstractC12645e, interfaceC5083e);
    }

    @Override // defpackage.AbstractC8797e
    public Object appmetrica(Uri uri, InputEvent inputEvent, InterfaceC5083e interfaceC5083e) {
        return smaato(this, uri, inputEvent, interfaceC5083e);
    }

    public Object loadAd(AbstractC2162e abstractC2162e, InterfaceC5083e interfaceC5083e) {
        return Signature(this, abstractC2162e, interfaceC5083e);
    }

    @Override // defpackage.AbstractC8797e
    public Object metrica(InterfaceC5083e interfaceC5083e) {
        return adcel(this, interfaceC5083e);
    }

    public Object mopub(AbstractC0803e abstractC0803e, InterfaceC5083e interfaceC5083e) {
        return advert(this, abstractC0803e, interfaceC5083e);
    }

    @Override // defpackage.AbstractC8797e
    public Object purchase(Uri uri, InterfaceC5083e interfaceC5083e) {
        return amazon(this, uri, interfaceC5083e);
    }

    public Object yandex(AbstractC0021e abstractC0021e, InterfaceC5083e interfaceC5083e) {
        return startapp(this, abstractC0021e, interfaceC5083e);
    }
}
