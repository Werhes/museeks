package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: eٌَؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8601e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f17418e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f17419e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17420e;

    public /* synthetic */ C8601e(String str, int i, String str2) {
        this.f17420e = i;
        this.f17419e = str;
        this.f17418e = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f17420e;
        String str = this.f17418e;
        String str2 = this.f17419e;
        C0639e c0639e = (C0639e) obj;
        switch (i) {
            case 0:
                C10796e c10796e = AbstractC1089e.vip;
                c0639e.ad(str2, c10796e);
                C10796e c10796e2 = AbstractC1089e.ad;
                c0639e.ad(str, c10796e, c10796e, c10796e2, c10796e2);
                c0639e.vip(str2, c10796e2);
                return Unit.INSTANCE;
            case 1:
                C10796e c10796e3 = AbstractC1089e.vip;
                c0639e.ad(str2, c10796e3);
                c0639e.ad(str, c10796e3, c10796e3, c10796e3);
                c0639e.vip(str2, c10796e3);
                return Unit.INSTANCE;
            case 2:
                C10796e c10796e4 = AbstractC1089e.vip;
                c0639e.ad(str2, c10796e4);
                C10796e c10796e5 = AbstractC1089e.ad;
                c0639e.ad(str, c10796e4, c10796e4, AbstractC1089e.metrica, c10796e5);
                c0639e.vip(str2, c10796e5);
                return Unit.INSTANCE;
            case 3:
                C10796e c10796e6 = AbstractC1089e.vip;
                c0639e.ad(str2, c10796e6);
                C10796e c10796e7 = AbstractC1089e.metrica;
                c0639e.ad(str2, c10796e7);
                C10796e c10796e8 = AbstractC1089e.ad;
                c0639e.ad(str, c10796e6, c10796e7, c10796e7, c10796e8);
                c0639e.vip(str2, c10796e8);
                return Unit.INSTANCE;
            case 4:
                C10796e c10796e9 = AbstractC1089e.metrica;
                c0639e.ad(str2, c10796e9);
                c0639e.vip(str, AbstractC1089e.vip, c10796e9);
                return Unit.INSTANCE;
            default:
                c0639e.ad(str2, AbstractC1089e.ad);
                c0639e.vip(str, AbstractC1089e.vip, AbstractC1089e.metrica);
                return Unit.INSTANCE;
        }
    }
}
