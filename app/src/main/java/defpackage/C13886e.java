package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13886e extends AbstractC4125e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f27545e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f27546e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C3079e f27530e = new C3079e("Before");

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C3079e f27542e = new C3079e("Transform");

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C3079e f27519e = new C3079e("After");

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C3079e f27533e = new C3079e("Before");

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C3079e f27518e = new C3079e("Transform");

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C3079e f27517e = new C3079e("Render");

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C3079e f27521e = new C3079e("ContentEncoding");

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C3079e f27526e = new C3079e("TransferEncoding");

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C3079e f27528e = new C3079e("After");

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C3079e f27525e = new C3079e("Engine");

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C3079e f27522e = new C3079e("Before");

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C3079e f27539e = new C3079e("State");

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C3079e f27544e = new C3079e("After");

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C3079e f27520e = new C3079e("Before");

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C3079e f27535e = new C3079e("State");

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final C3079e f27541e = new C3079e("Transform");

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final C3079e f27543e = new C3079e("Render");

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final C3079e f27534e = new C3079e("Send");

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final C3079e f27531e = new C3079e("Receive");

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public static final C3079e f27532e = new C3079e("Parse");

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public static final C3079e f27538e = new C3079e("Transform");

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public static final C3079e f27529e = new C3079e("State");

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public static final C3079e f27524e = new C3079e("After");

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public static final C3079e f27536e = new C3079e("Before");

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public static final C3079e f27523e = new C3079e("State");

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public static final C3079e f27540e = new C3079e("Monitoring");

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public static final C3079e f27537e = new C3079e("Engine");

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public static final C3079e f27527e = new C3079e("Receive");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13886e(int i) {
        super(f27522e, f27539e, f27544e);
        this.f27546e = i;
        switch (i) {
            case 3:
                super(f27520e, f27535e, f27541e, f27543e, f27534e);
                this.f27545e = true;
                return;
            case 4:
                super(f27531e, f27532e, f27538e, f27529e, f27524e);
                this.f27545e = true;
                return;
            case 5:
                super(f27536e, f27523e, f27540e, f27537e, f27527e);
                this.f27545e = true;
                return;
            default:
                this.f27545e = true;
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13886e(boolean z, int i) {
        super(f27530e, f27542e, f27519e);
        this.f27546e = i;
        switch (i) {
            case 1:
                super(f27533e, f27518e, f27517e, f27521e, f27526e, f27528e, f27525e);
                this.f27545e = z;
                return;
            default:
                this.f27545e = z;
                return;
        }
    }

    @Override // defpackage.AbstractC4125e
    public final boolean billing() {
        switch (this.f27546e) {
            case 0:
                return this.f27545e;
            case 1:
                return this.f27545e;
            case 2:
                return this.f27545e;
            case 3:
                return this.f27545e;
            case 4:
                return this.f27545e;
            default:
                return this.f27545e;
        }
    }
}
