package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3375e extends AbstractC10347e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final List f7571e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final String f7572e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final long f7573e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final String f7574e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final String f7575e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final List f7576e;

    public C3375e(long j, String str, String str2) {
        super(1);
        this.f7573e = j;
        this.f7572e = str;
        this.f7575e = str2;
        this.f7576e = AbstractC6874e.startapp(new C0963e(new C9837e(AbstractC0869e.isVip(j, "https://vk.com/audios"), 3)), new C0051e(j), new C4273e(j));
        VKXApplication.Companion companion = VKXApplication.f36531e;
        this.f7571e = AbstractC6874e.startapp(VKXApplication.Companion.vip(R.string.pv_lib), VKXApplication.Companion.vip(R.string.wall_audios), VKXApplication.Companion.vip(R.string.wall_playlists));
        this.f7574e = BuildConfig.FLAVOR;
    }

    @Override // defpackage.AbstractC10347e, defpackage.AbstractC10716e
    /* renamed from: break, reason: not valid java name */
    public final String mo1348break() {
        return this.f7574e;
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: new, reason: not valid java name */
    public final List mo1349new() {
        return this.f7571e;
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: super, reason: not valid java name */
    public final List mo1350super() {
        return this.f7576e;
    }

    @Override // defpackage.AbstractC10347e, defpackage.AbstractC10716e
    /* renamed from: try */
    public final AbstractC18491e mo216try() {
        return new C2479e(this.f7573e, this.f7572e, this.f7575e);
    }
}
