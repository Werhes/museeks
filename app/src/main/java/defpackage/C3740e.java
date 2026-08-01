package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۥُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C3740e {
    public final Context ad;
    public Messenger billing;
    public final Bundle metrica;
    public C10312e purchase;
    public final MediaBrowser vip;
    public MediaSessionCompat$Token yandex;
    public final HandlerC17805e license = new HandlerC17805e(this);
    public final C2271e appmetrica = new C17519e(0);

    /* JADX WARN: Type inference failed for: r0v1, types: [eٕ٘ؔ, eؓۨۖ] */
    public C3740e(Context context, ComponentName componentName, C2532e c2532e) {
        this.ad = context;
        Bundle bundle = new Bundle();
        this.metrica = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        c2532e.f6386e = this;
        this.vip = new MediaBrowser(context, componentName, (C16691e) c2532e.f6388e, bundle);
    }
}
