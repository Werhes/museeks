package defpackage;

import android.media.AudioManager;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12350e implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f24774e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24775e;

    public /* synthetic */ C12350e(int i, Object obj) {
        this.f24775e = i;
        this.f24774e = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        C3335e c3335e;
        switch (this.f24775e) {
            case 0:
                C16683e c16683e = (C16683e) this.f24774e;
                c16683e.getClass();
                if (i == -3 || i == -2) {
                    if (i != -2 && ((c3335e = c16683e.license) == null || c3335e.ad != 1)) {
                        c16683e.metrica(4);
                        return;
                    } else {
                        c16683e.vip(0);
                        c16683e.metrica(3);
                        return;
                    }
                }
                if (i == -1) {
                    c16683e.vip(-1);
                    c16683e.ad();
                    c16683e.metrica(1);
                    return;
                } else if (i != 1) {
                    AbstractC10257e.pro("Unknown focus change type: ", i, "AudioFocusManager");
                    return;
                } else {
                    c16683e.metrica(2);
                    c16683e.vip(1);
                    return;
                }
            default:
                ((Function1) ((C3168e) this.f24774e).f7271e).invoke(Boolean.valueOf(i == -1 || i == -2 || i == -3));
                return;
        }
    }
}
