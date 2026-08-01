package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.appmetrica;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15944e {
    public final MediaSession ad;
    public MediaMetadataCompat billing;
    public final MediaSessionCompat$Token metrica;
    public PlaybackStateCompat purchase;
    public C15938e startapp;
    public final appmetrica vip;
    public AbstractC9882e yandex;
    public final Object license = new Object();
    public final RemoteCallbackList appmetrica = new RemoteCallbackList();

    public C15944e(Context context) {
        MediaSession ad = ad(context);
        this.ad = ad;
        appmetrica appmetricaVar = new appmetrica(this);
        this.vip = appmetricaVar;
        this.metrica = new MediaSessionCompat$Token(ad.getSessionToken(), appmetricaVar);
        ad.setFlags(3);
    }

    public MediaSession ad(Context context) {
        return new MediaSession(context, "CastMediaSession");
    }

    public final void appmetrica(AbstractC9882e abstractC9882e, Handler handler) {
        synchronized (this.license) {
            try {
                this.yandex = abstractC9882e;
                this.ad.setCallback(abstractC9882e == null ? null : (C18263e) abstractC9882e.appmetrica, handler);
                if (abstractC9882e != null) {
                    abstractC9882e.m2747abstract(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final PlaybackStateCompat license() {
        return this.purchase;
    }

    public C15938e metrica() {
        C15938e c15938e;
        synchronized (this.license) {
            c15938e = this.startapp;
        }
        return c15938e;
    }

    public void purchase(C15938e c15938e) {
        synchronized (this.license) {
            this.startapp = c15938e;
        }
    }

    public final AbstractC9882e vip() {
        AbstractC9882e abstractC9882e;
        synchronized (this.license) {
            abstractC9882e = this.yandex;
        }
        return abstractC9882e;
    }
}
