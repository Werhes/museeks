package ealvatag.tag.datatype;

import ealvatag.tag.id3.framebody.FrameBodyETCO;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class EventTimingCodeList extends AbstractDataTypeList<EventTimingCode> {
    public EventTimingCodeList(EventTimingCodeList eventTimingCodeList) {
        super(eventTimingCodeList);
    }

    public EventTimingCodeList(FrameBodyETCO frameBodyETCO) {
        super(DataTypes.OBJ_TIMED_EVENT_LIST, frameBodyETCO);
    }

    @Override // ealvatag.tag.datatype.AbstractDataTypeList
    public EventTimingCode createListElement() {
        return new EventTimingCode(DataTypes.OBJ_TIMED_EVENT, this.frameBody);
    }
}
