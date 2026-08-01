package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2584e {
    public final MediaSession ad;
    public int adcel;
    public AbstractC9882e advert;
    public final Bundle appmetrica;
    public C4820e billing;
    public final C13765e metrica;
    public int mopub;
    public C18287e smaato;
    public C3737e startapp;
    public final BinderC0188e vip;
    public List yandex;
    public final Object license = new Object();
    public final RemoteCallbackList purchase = new RemoteCallbackList();

    public C2584e(Context context, Bundle bundle, String str) {
        MediaSession ad = ad(context, bundle, str);
        this.ad = ad;
        BinderC0188e binderC0188e = new BinderC0188e(this);
        this.vip = binderC0188e;
        this.metrica = new C13765e(ad.getSessionToken(), binderC0188e);
        this.appmetrica = bundle;
        ad.setFlags(3);
    }

    public MediaSession ad(Context context, Bundle bundle, String str) {
        return new MediaSession(context, str);
    }

    public void license(C18287e c18287e) {
        synchronized (this.license) {
            this.smaato = c18287e;
        }
    }

    public C18287e metrica() {
        C18287e c18287e;
        synchronized (this.license) {
            c18287e = this.smaato;
        }
        return c18287e;
    }

    public final AbstractC9882e vip() {
        AbstractC9882e abstractC9882e;
        synchronized (this.license) {
            abstractC9882e = this.advert;
        }
        return abstractC9882e;
    }
}
