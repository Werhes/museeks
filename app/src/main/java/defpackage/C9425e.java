package defpackage;

import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9425e extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final List f18762e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final List f18763e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final String f18764e;

    public C9425e() {
        super(1);
        C14027e.ad.getClass();
        this.f18763e = AbstractC6874e.startapp(new C0051e(C14027e.metrica()), new C4273e(C14027e.metrica()));
        VKXApplication.Companion companion = VKXApplication.f36531e;
        this.f18762e = AbstractC6874e.startapp(VKXApplication.Companion.vip(R.string.news_audios), VKXApplication.Companion.vip(R.string.news_playlists));
        this.f18764e = VKXApplication.Companion.vip(R.string.acc_wall);
    }

    @Override // defpackage.AbstractC10347e, defpackage.AbstractC10716e
    /* renamed from: break */
    public final String mo1348break() {
        return this.f18764e;
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: new */
    public final List mo1349new() {
        return this.f18762e;
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: super */
    public final List mo1350super() {
        return this.f18763e;
    }
}
