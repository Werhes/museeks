package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0963e extends AbstractC15876e {

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final /* synthetic */ int f3399e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final Cpackage f3400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0963e() {
        super(null);
        this.f3399e = 0;
        this.f3400e = new Cpackage(12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0963e(C9837e c9837e) {
        super(null);
        this.f3399e = 2;
        this.f3400e = new C15177e(1, c9837e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0963e(String str, int i) {
        super(null);
        this.f3399e = i;
        switch (i) {
            case 4:
                super(null);
                this.f3400e = new C2230e(str);
                return;
            case 5:
                super(null);
                this.f3400e = new C6252e(str, 3);
                return;
            default:
                this.f3400e = new C6252e(str, 0);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0963e(String str, Function0 function0) {
        super(str);
        this.f3399e = 1;
        this.f3400e = new C15177e(0, function0);
    }

    @Override // defpackage.AbstractC15876e, defpackage.InterfaceC8370e
    public boolean admob() {
        switch (this.f3399e) {
            case 0:
                return false;
            default:
                return super.admob();
        }
    }

    @Override // defpackage.AbstractC15876e
    /* renamed from: const, reason: not valid java name */
    public final Cpackage mo447const() {
        switch (this.f3399e) {
            case 0:
                return (C10638e) this.f3400e;
            case 1:
                return (C15177e) this.f3400e;
            case 2:
                return (C15177e) this.f3400e;
            case 3:
                return (C6252e) this.f3400e;
            case 4:
                return (C2230e) this.f3400e;
            default:
                return (C6252e) this.f3400e;
        }
    }
}
