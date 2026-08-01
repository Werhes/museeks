package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7927e implements InterfaceC14502e {
    public final Bundle ad;

    public C7927e(Context context) {
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.ad = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // defpackage.InterfaceC14502e
    public final Boolean ad() {
        Bundle bundle = this.ad;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // defpackage.InterfaceC14502e
    public final Double license() {
        Bundle bundle = this.ad;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // defpackage.InterfaceC14502e
    public final C14157e metrica() {
        Bundle bundle = this.ad;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new C14157e(AbstractC0326e.Signature(bundle.getInt("firebase_sessions_sessions_restart_timeout"), EnumC15934e.SECONDS));
        }
        return null;
    }

    @Override // defpackage.InterfaceC14502e
    public final Object vip(InterfaceC5083e interfaceC5083e) {
        return Unit.INSTANCE;
    }
}
