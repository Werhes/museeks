package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9690e {
    public static final AtomicReference Signature = new AtomicReference(null);
    public final Context ad;
    public final C1410e adcel;
    public final C1410e advert;
    public final int amazon;
    public PendingIntent appmetrica;
    public final Bundle billing;
    public final C1439e license;
    public boolean loadAd;
    public final String metrica;
    public final C1410e mopub;
    public final Bundle purchase;
    public final boolean smaato;
    public final boolean startapp;
    public final InterfaceC16843e vip;
    public InterfaceC14343e yandex;

    public C9690e(PlaybackService playbackService, C18464e c18464e, C1439e c1439e) {
        Context applicationContext = playbackService.getApplicationContext();
        applicationContext.getClass();
        this.ad = applicationContext;
        c18464e.getClass();
        this.vip = c18464e;
        AbstractC2301e.billing(c18464e.mo3031e());
        this.metrica = BuildConfig.FLAVOR;
        this.license = c1439e;
        this.purchase = new Bundle();
        this.billing = new Bundle();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        this.adcel = c1410e;
        this.mopub = c1410e;
        this.startapp = true;
        this.smaato = true;
        this.advert = c1410e;
        this.amazon = 2;
    }
}
