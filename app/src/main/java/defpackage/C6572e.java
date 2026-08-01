package defpackage;

import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.os.Build;
import androidx.car.app.model.Alert;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6572e implements InterfaceC8524e, InterfaceC1232e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static int f13545e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C14137e f13546e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C12490e f13547e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C9556e f13548e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public EnumC9702e f13549e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Function0 f13550e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f13551e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f13552e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f13553e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eٌٍٚ] */
    public C6572e(C12490e c12490e, Context context, C14826e c14826e, InterfaceC8467e interfaceC8467e, Function0 function0) {
        InterfaceC8018e ad = AbstractC10024e.ad(context);
        ?? obj = new Object();
        obj.f18968e = ad;
        obj.f18967e = interfaceC8467e;
        obj.f18970e = -1;
        C1169e license = AbstractC6874e.license();
        if (AbstractC3383e.ad().contains(AudioEffect.EFFECT_TYPE_BASS_BOOST)) {
            license.add(new C10882e(0));
        }
        if (AbstractC3383e.ad().contains(AudioEffect.EFFECT_TYPE_ENV_REVERB)) {
            license.add(new C10882e(1));
        }
        if (Build.VERSION.SDK_INT >= 28 && AbstractC3383e.ad().contains(UUID.fromString("7261676f-6d75-7369-6364-28e2fd3ac39e"))) {
            license.add(new Object());
        }
        obj.f18969e = AbstractC6874e.metrica(license);
        AbstractC5336e.purchase(c14826e, null, 0, new C7602e(obj, null, 25), 3);
        this.f13551e = context;
        this.f13548e = obj;
        this.f13547e = c12490e;
        this.f13550e = function0;
        this.f13546e = AbstractC12501e.ad(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
        this.f13549e = EnumC9702e.f19202e;
        AbstractC5336e.purchase(c14826e, null, 0, new C8857e(this, null, 10), 3);
        c12490e.mo2133protected(this);
    }

    public static final void billing(C6572e c6572e) {
        C14137e c14137e = c6572e.f13546e;
        if (c6572e.f13552e) {
            c14137e.amazon(C12734e.ad);
            if (((Boolean) c6572e.f13550e.invoke()).booleanValue()) {
                c14137e.amazon(C17686e.ad);
            }
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void Signature(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: abstract */
    public final /* synthetic */ void mo1480abstract(C5298e c5298e) {
    }

    @Override // defpackage.InterfaceC1232e
    public final void ad() {
        this.f13546e.amazon(C12734e.ad);
        this.f13547e.mo2121e(this);
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void admob(float f) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void ads(C8256e c8256e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void amazon(C17750e c17750e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void appmetrica(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: break */
    public final /* synthetic */ void mo1481break(C4194e c4194e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: case */
    public final /* synthetic */ void mo1482case(int i, int i2) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: class */
    public final /* synthetic */ void mo1484class(long j) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void crashlytics(C8256e c8256e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: default */
    public final /* synthetic */ void mo1485default(C5251e c5251e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: extends */
    public final /* synthetic */ void mo1486extends() {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: final */
    public final /* synthetic */ void mo1487final(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void firebase(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: goto */
    public final /* synthetic */ void mo1488goto(C12053e c12053e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: implements */
    public final /* synthetic */ void mo1489implements(long j) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: interface */
    public final /* synthetic */ void mo1491interface(C12053e c12053e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void isPro(C9039e c9039e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void isVip(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void license(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void loadAd(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void metrica(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void mopub(C4491e c4491e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: native */
    public final /* synthetic */ void mo1492native(AbstractC6690e abstractC6690e, int i) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void premium(C18255e c18255e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void pro(int i) {
        this.f13546e.amazon(new C15117e(i));
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void purchase(C0101e c0101e, C0101e c0101e2, int i) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void signatures(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void smaato(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void startapp(C3335e c3335e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void subs(InterfaceC16843e interfaceC16843e, C3164e c3164e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void subscription(int i, C1962e c1962e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: this */
    public final /* synthetic */ void mo1499this(long j) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: throw */
    public final /* synthetic */ void mo1500throw(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: try */
    public final /* synthetic */ void mo1502try(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void vip(C2351e c2351e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: while */
    public final /* synthetic */ void mo1503while(List list) {
    }

    public final void yandex() {
        this.f13546e.amazon(new C7749e((EnumC9702e) AbstractC16524e.amazon.ad(), ((Boolean) AbstractC16524e.smaato.ad()).booleanValue()));
    }
}
