package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3579e extends ViewGroup.MarginLayoutParams {
    public int Signature;

    /* renamed from: abstract, reason: not valid java name */
    public int f8067abstract;
    public int ad;
    public int adcel;
    public int admob;
    public int ads;
    public int advert;
    public int amazon;
    public int applovin;
    public int appmetrica;
    public int billing;

    /* renamed from: break, reason: not valid java name */
    public int f8068break;

    /* renamed from: case, reason: not valid java name */
    public int f8069case;

    /* renamed from: catch, reason: not valid java name */
    public int f8070catch;

    /* renamed from: class, reason: not valid java name */
    public float f8071class;

    /* renamed from: const, reason: not valid java name */
    public float f8072const;

    /* renamed from: continue, reason: not valid java name */
    public float f8073continue;
    public int crashlytics;

    /* renamed from: default, reason: not valid java name */
    public float f8074default;

    /* renamed from: else, reason: not valid java name */
    public int f8075else;

    /* renamed from: extends, reason: not valid java name */
    public int f8076extends;

    /* renamed from: final, reason: not valid java name */
    public int f8077final;

    /* renamed from: finally, reason: not valid java name */
    public int f8078finally;
    public float firebase;

    /* renamed from: for, reason: not valid java name */
    public int f8079for;

    /* renamed from: goto, reason: not valid java name */
    public float f8080goto;

    /* renamed from: implements, reason: not valid java name */
    public float f8081implements;

    /* renamed from: import, reason: not valid java name */
    public boolean f8082import;
    public int inmobi;

    /* renamed from: instanceof, reason: not valid java name */
    public boolean f8083instanceof;

    /* renamed from: interface, reason: not valid java name */
    public String f8084interface;
    public int isPro;
    public int isVip;
    public boolean license;
    public int loadAd;
    public float metrica;
    public int mopub;

    /* renamed from: native, reason: not valid java name */
    public int f8085native;

    /* renamed from: new, reason: not valid java name */
    public boolean f8086new;

    /* renamed from: package, reason: not valid java name */
    public boolean f8087package;
    public int premium;

    /* renamed from: private, reason: not valid java name */
    public int f8088private;
    public int pro;

    /* renamed from: protected, reason: not valid java name */
    public int f8089protected;

    /* renamed from: public, reason: not valid java name */
    public C11325e f8090public;
    public int purchase;
    public int remoteconfig;

    /* renamed from: return, reason: not valid java name */
    public int f8091return;
    public int signatures;
    public int smaato;
    public int startapp;

    /* renamed from: static, reason: not valid java name */
    public boolean f8092static;

    /* renamed from: strictfp, reason: not valid java name */
    public String f8093strictfp;
    public int subs;
    public float subscription;

    /* renamed from: super, reason: not valid java name */
    public boolean f8094super;

    /* renamed from: switch, reason: not valid java name */
    public int f8095switch;

    /* renamed from: synchronized, reason: not valid java name */
    public int f8096synchronized;
    public int tapsense;

    /* renamed from: this, reason: not valid java name */
    public float f8097this;

    /* renamed from: throw, reason: not valid java name */
    public int f8098throw;

    /* renamed from: throws, reason: not valid java name */
    public int f8099throws;

    /* renamed from: transient, reason: not valid java name */
    public boolean f8100transient;

    /* renamed from: try, reason: not valid java name */
    public int f8101try;
    public int vip;

    /* renamed from: volatile, reason: not valid java name */
    public int f8102volatile;

    /* renamed from: while, reason: not valid java name */
    public int f8103while;
    public int yandex;

    public final void ad() {
        this.f8083instanceof = false;
        this.f8087package = true;
        this.f8100transient = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f8094super) {
            this.f8087package = false;
            if (this.f8098throw == 0) {
                this.f8098throw = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f8086new) {
            this.f8100transient = false;
            if (this.f8103while == 0) {
                this.f8103while = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f8087package = false;
            if (i == 0 && this.f8098throw == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f8094super = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f8100transient = false;
            if (i2 == 0 && this.f8103while == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f8086new = true;
            }
        }
        if (this.metrica == -1.0f && this.ad == -1 && this.vip == -1) {
            return;
        }
        this.f8083instanceof = true;
        this.f8087package = true;
        this.f8100transient = true;
        if (!(this.f8090public instanceof C0913e)) {
            this.f8090public = new C0913e();
        }
        ((C0913e) this.f8090public).m431implements(this.f8077final);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3579e.resolveLayoutDirection(int):void");
    }
}
